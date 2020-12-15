package com.gossipmongers.mobicomkit.listners;

import android.content.Context;

import com.gossipmongers.mobicomkit.api.account.register.RegistrationResponse;

/**
 * Created by reytum on 30/11/17.
 */

public interface AlLoginHandler {
    void onSuccess(RegistrationResponse registrationResponse, Context context);

    void onFailure(RegistrationResponse registrationResponse, Exception exception);
}
