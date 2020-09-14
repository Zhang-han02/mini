package com.han.api;

/**
 * API操作码
 * Created by macro on 17:30 2020/9/9
 */
public enum ResultCode implements IErrorCode{

    SUCCESS(200,"操作成功");
    private long code;
    private String msg;

    private ResultCode(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getmsg() {
        return msg;
    }
}
