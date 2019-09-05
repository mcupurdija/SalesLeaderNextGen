package com.intelisale.networking.api;

import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.customers.SyncCustomersResponseSchema;
import com.intelisale.networking.schema.sync.SyncSchema;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface SyncApi {

    @POST("api/{financialEntityId}/SyncData")
    Call<BaseSchema<SyncCustomersResponseSchema>> syncCustomers(@Path("financialEntityId") int financialEntityId, @Body List<SyncSchema> syncRequest);

    @POST("api/{financialEntityId}/SyncData")
    Single<BaseSchema<SyncCustomersResponseSchema>> syncCustomersRx(@Path("financialEntityId") int financialEntityId, @Body List<SyncSchema> syncRequest);
}
