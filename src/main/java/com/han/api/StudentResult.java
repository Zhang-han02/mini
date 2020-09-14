package com.han.api;

/**
 * 通用返回对象
 * Created by macro on 16:55 2020/9/9
 */
public class StudentResult<T> {

    private long code;
    private String msg;
    private T data;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    protected StudentResult() {
    }

    protected StudentResult(long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    /**
     * 成功返回结果
     * data : 获取的数据
     */
    public static <T> StudentResult<T> success(T data){
        return new StudentResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getmsg(),data);
    }

    /**
     * 成功返回结果
     * data : 获取的数据
     * msg : 提示的消息
     */
    public static <T> StudentResult<T> success(T data,String msg){
        return new StudentResult<T>(ResultCode.SUCCESS.getCode(),msg,data);
    }

}
