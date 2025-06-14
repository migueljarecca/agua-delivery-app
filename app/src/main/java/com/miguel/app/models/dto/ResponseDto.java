package com.miguel.app.models.dto;

public class ResponseDto {
    
    private String statusCode;

    private String statusMsg;

    
    public ResponseDto() {
    }

    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    @Override
    public String toString() {
        return "ResponseDto [statusCode=" + statusCode + ", statusMsg=" + statusMsg + "]";
    }

}
