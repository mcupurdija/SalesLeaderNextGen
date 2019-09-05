package com.intelisale.networking.di;

import com.intelisale.networking.Endpoints;
import com.intelisale.networking.SessionManager;
import com.intelisale.networking.api.LoginApi;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.interceptor.LoggingInterceptor;
import com.intelisale.networking.interceptor.TokenInterceptor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Module
public class NetworkingModule {

    @Singleton
    @Provides
    OkHttpClient okHttpClient(SessionManager sessionManager) {

        return new OkHttpClient().newBuilder()
                .addInterceptor(new LoggingInterceptor())
                .addInterceptor(new TokenInterceptor(sessionManager))
                .build();
    }

    @Singleton
    @Provides
    Retrofit retrofit(OkHttpClient okHttpClient) {

        return new Retrofit.Builder()
                .baseUrl(Endpoints.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    LoginApi loginApi(Retrofit retrofit) {
        return retrofit.create(LoginApi.class);
    }

    @Singleton
    @Provides
    SyncApi syncApi(Retrofit retrofit) {
        return retrofit.create(SyncApi.class);
    }
}
