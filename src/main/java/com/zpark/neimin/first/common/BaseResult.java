package com.zpark.neimin.first.common;

public class BaseResult {

    private boolean isSuccess;

    //结果编码
    private String resultCode;


    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


}