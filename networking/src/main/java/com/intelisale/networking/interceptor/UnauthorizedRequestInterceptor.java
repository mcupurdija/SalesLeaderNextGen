package com.intelisale.networking.interceptor;

import android.content.Context;
import android.content.Intent;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class UnauthorizedRequestInterceptor implements Interceptor {

    private final Context mContext;

    public UnauthorizedRequestInterceptor(Context mContext) {
        this.mContext = mContext;
    }

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {

        Request request = chain.request();
        Response response = chain.proceed(request);

        if (response.code() == 401) {

            try {
                Intent intent = new Intent(mContext, Class.forName("com.intelisale.login.LoginActivity"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(Intent.EXTRA_REMOTE_INTENT_TOKEN, true);
                mContext.startActivity(intent);
            } catch (Exception ignored) {
            }
        }

        return response;
    }
}