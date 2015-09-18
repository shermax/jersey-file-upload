package com.shermax.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Sherzod on 8/23/2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SimpleResult {
    private String status;
    private String message;

    public SimpleResult() {
    }

    public SimpleResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
