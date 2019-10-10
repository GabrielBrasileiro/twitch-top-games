package com.universodoandroid.remote

import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route

class TokenAuthenticator(
    private val clientId: String,
    private val accept: String
) : Authenticator {

    override fun authenticate(route: Route?, response: Response): Request? {
        return response.request().newBuilder()
            .addHeader("client-id", clientId)
            .addHeader("accept", accept)
            .build()
    }

}