package com.intelisale.core.useCase;

import com.intelisale.core.settings.SettingsManager;
import com.intelisale.core.ui.BaseObservable;
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

    private final LoginApi mLoginApi;
    private final SettingsManager mSettingsManager;
    private final SessionManager mSessionManager;

    public LoginUseCase(LoginApi mLoginApi, SettingsManager settingsManager, SessionManager sessionManager) {
        this.mLoginApi = mLoginApi;
        this.mSettingsManager = settingsManager;
        this.mSessionManager = sessionManager;
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

                            mSettingsManager.setUserData("");
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
