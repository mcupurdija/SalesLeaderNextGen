package com.intelisale.core.useCase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.ui.BaseObservable;
import com.intelisale.core.util.HttpUtils;
import com.intelisale.networking.SessionManager;
import com.intelisale.networking.api.LoginApi;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.login.LoginSchema;
import com.intelisale.networking.schema.login.UserDetailsSchema;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginUseCase extends BaseObservable<LoginUseCase.Listener> {

    public interface Listener {
        void onLoginSucceeded();

        void onLoginFailed(String message);
    }

    private final ObjectMapper mObjectMapper;
    private final LoginApi mLoginApi;
    private final SettingsManager mSettingsManager;
    private final SessionManager mSessionManager;

    public LoginUseCase(ObjectMapper mObjectMapper, LoginApi mLoginApi, SettingsManager mSettingsManager, SessionManager mSessionManager) {
        this.mObjectMapper = mObjectMapper;
        this.mLoginApi = mLoginApi;
        this.mSettingsManager = mSettingsManager;
        this.mSessionManager = mSessionManager;
    }

    public void loginInBackground() {

        UserDetailsSchema userDetailsSchema = mSessionManager.getUserDetailsSchema();
        loginUser(userDetailsSchema.getUserName(), userDetailsSchema.getPassword());
    }

    public void loginUser(String username, String password) {

        Single<LoginSchema> login = mLoginApi.login(username, password);
        login.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<LoginSchema>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(LoginSchema loginSchema) {

                        mSettingsManager.setToken(loginSchema.getToken());

                        mSessionManager.setToken(loginSchema.getToken());

                        getUserDetails();
                    }

                    @Override
                    public void onError(Throwable e) {
                        onLoginFailed(e.getMessage());
                    }
                });
    }

    private void getUserDetails() {

        Single<BaseSchema<UserDetailsSchema>> userDetails = mLoginApi.userDetails();
        userDetails.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<BaseSchema<UserDetailsSchema>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onSuccess(BaseSchema<UserDetailsSchema> userDetails) {

                        if (userDetails.getSuccess()) {

                            mSettingsManager.setUserData(HttpUtils.serialize(mObjectMapper, userDetails.getData()));
                            mSettingsManager.setUserLogged(true);

                            mSessionManager.setUserDetailsSchema(userDetails.getData());

                            onLoginSucceeded();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        onLoginFailed(e.getMessage());
                    }
                });
    }

    private void onLoginSucceeded() {
        for (Listener listener : getListeners()) {
            listener.onLoginSucceeded();
        }
    }

    private void onLoginFailed(String message) {
        for (Listener listener : getListeners()) {
            listener.onLoginFailed(message);
        }
    }
}
