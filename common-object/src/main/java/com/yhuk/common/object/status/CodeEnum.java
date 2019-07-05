package com.yhuk.common.object.status;


import com.yhuk.common.object.Code;

public enum CodeEnum implements Code {

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "网络异常！"),
    /**
     * 参数验证失败
     */
    INVALID_PARAMETERS(501, "非法参数！"),

    /**
     * Token验证不通过或者没有登录
     */
    INVALID_TOKEN(502, "没有权限！"),
    /**
     * 处理失败
     */
    FAILED(503, "处理失败！"),

    /**
     * 查找失败
     */
    NOT_FOUND(504, "查找失败！"),
    /**
     * Token验证不通过或者没有登录
     */
    NOT_LOGIN(505, "请先登录！"),
    /**
     * 响应成功
     */
    SUCCESS(200, "Success");

    private int code;

    private String value;

    CodeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return value;
    }
}
