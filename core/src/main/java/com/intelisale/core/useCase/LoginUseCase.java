package com.intelisale.core.useCase;

import com.intelisale.core.ui.BaseObservable;
import com.intelisale.networking.api.LoginApi;
import com.intelisale.networking.schema.login.LoginSchema;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginUseCase extends BaseObservable<LoginUseCase.Listener> {

    public interface Listener {
        void onLoginSucceeded();

        void onLoginFailed();
    }

    private final LoginApi mLoginApi;

    public LoginUseCase(LoginApi loginApi) {
        this.mLoginApi = loginApi;
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
                        for (Listener listener : getListeners()) {
                            listener.onLoginSucceeded();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        for (Listener listener : getListeners()) {
                            listener.onLoginFailed();
                        }
                    }
                });
    }
}
