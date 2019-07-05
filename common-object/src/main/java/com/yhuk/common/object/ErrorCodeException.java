package com.yhuk.common.object;


/**
 * @Description 自定义异常
 * @Author gaozhi.liu
 * @Date 2019/6/4 10:35
 * @Version 1.0
 **/
public class ErrorCodeException extends RuntimeException{

    private Code code;

    private String errExtMsg;

    public ErrorCodeException(Code code) {
        super();
        this.code = code;
    }
    public ErrorCodeException(Code code,String errExtMsg) {
        super(errExtMsg);
        this.code = code;
        this.errExtMsg = errExtMsg;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getErrExtMsg() {
        return errExtMsg;
    }

    public void setErrExtMsg(String errExtMsg) {
        this.errExtMsg = errExtMsg;
    }
}
