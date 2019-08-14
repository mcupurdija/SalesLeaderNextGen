package com.intelisale.networking.interceptor;

import com.intelisale.networking.SessionManager;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Locale;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenInterceptor implements Interceptor {

    private final SessionManager sessionManager;

    public TokenInterceptor(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {

        Request request = chain.request();

        Request.Builder builder = request.newBuilder()
                .header("Content-Type", "application/json; charset=utf-8")
                .method(request.method(), request.body());

        String token = sessionManager.getToken();
        if (!request.url().toString().endsWith("/connect") && token != null) {
            builder.header("Authorization", String.format(Locale.getDefault(), "Bearer %s", token));
        }

        return chain.proceed(builder.build());
    }
}
