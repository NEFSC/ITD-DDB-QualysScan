package com.example.GitHubActionsQWas.WASClient;

import com.google.gson.JsonObject;

public class QualysWASResponse extends QualysAPIResponse{
    public JsonObject response;

    public QualysWASResponse() {
        super();
        response = null;
    }
}