package com.convexa.ai.convexa_ai_backend.dto;

/**
 * Request body for POST /api/auth/google
 * The frontend sends the raw Google ID token returned by GIS.
 */


public class GoogleAuthRequest {

    private String credential;   // raw Google ID token (JWT)

    public GoogleAuthRequest() {}

    public String getCredential() { return credential; }
    public void setCredential(String credential) { this.credential = credential; }
}
