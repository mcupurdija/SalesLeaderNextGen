package com.intelisale.networking.api;

import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.contacts.SyncContactsResponseSchema;
import com.intelisale.networking.schema.customers.SyncCustomersResponseSchema;
import com.intelisale.networking.schema.items.SyncItemsResponseSchema;
import com.intelisale.networking.schema.notes.SyncNotesResponseSchema;
import com.intelisale.networking.schema.settings.UserSettingsSchema;
import com.intelisale.networking.schema.sync.SyncSchema;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface SyncApi {

    @POST("api/{financialEntityId}/SyncData")
    Call<BaseSchema<SyncCustomersResponseSchema>> syncCustomers(@Path("financialEntityId") int financialEntityId, @Body List<SyncSchema> syncRequest);

    @POST("api/{financialEntityId}/SyncData")
    Call<BaseSchema<SyncItemsResponseSchema>> syncItems(@Path("financialEntityId") int financialEntityId, @Body List<SyncSchema> syncRequest);

    @POST("api/{financialEntityId}/SyncData")
    Call<BaseSchema<SyncContactsResponseSchema>> syncContacts(@Path("financialEntityId") int financialEntityId, @Body List<SyncSchema> syncRequest);

    @POST("api/{financialEntityId}/SyncData")
    Call<BaseSchema<SyncNotesResponseSchema>> syncNotes(@Path("financialEntityId") int financialEntityId, @Body List<SyncSchema> syncRequest);

    @GET("api/settings/android")
    Call<BaseSchema<List<UserSettingsSchema>>> syncSettings();
}
