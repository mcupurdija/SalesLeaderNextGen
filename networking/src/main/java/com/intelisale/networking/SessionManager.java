package com.intelisale.networking;

import com.intelisale.networking.schema.login.UserDetailsSchema;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SessionManager {

    private String token;
    private UserDetailsSchema userDetailsSchema;

    @Inject
    public SessionManager() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserDetailsSchema getUserDetailsSchema() {
        return userDetailsSchema;
    }

    public void setUserDetailsSchema(UserDetailsSchema userDetailsSchema) {
        this.userDetailsSchema = userDetailsSchema;
    }

    @NotNull
    @Override
    public String toString() {
        return "SessionManager{" +
                "token='" + token + '\'' +
                '}';
    }
}
