package com.intelisale.networking.api;

import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.login.AppVersionSchema;
import com.intelisale.networking.schema.login.LoginSchema;
import com.intelisale.networking.schema.login.UserDetailsSchema;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LoginApi {

    @FormUrlEncoded
    @POST("api/connect")
    Single<LoginSchema> login(@Field("username") String username, @Field("password") String password);

    @GET("api/users/current")
    Single<BaseSchema<UserDetailsSchema>> userDetails();

    @GET("api/connect/version")
    Single<BaseSchema<AppVersionSchema>> appVersion();

    @GET("api/ping")
    Single<Void> ping();
}
