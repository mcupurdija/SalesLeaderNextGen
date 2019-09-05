package com.intelisale.networking.interceptor;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import timber.log.Timber;

public class LoggingInterceptor implements Interceptor {

    public static final String TAG = "REQUEST_LOG";

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request();

        long t1 = System.nanoTime();
        Timber.i("Sending %s request %s%nBody: %s%n%s", request.method(), request.url(), bodyToString(request), request.headers().toString());

        Response response = chain.proceed(request);

        long t2 = System.nanoTime();
        Timber.i("Received response for %s in %.1fms%nCode %d%n%s", response.request().url(), (t2 - t1) / 1e6d, response.code(), response.headers());

        return response;
    }

    private static String bodyToString(final Request request) {

        try {
            final Buffer buffer = new Buffer();
            final RequestBody requestBody = request.body();
            if (requestBody != null) {
                requestBody.writeTo(buffer);
                return buffer.readUtf8();
            } else {
                return "{}";
            }
        } catch (Exception e) {
            return "cant read request body";
        }
    }
}