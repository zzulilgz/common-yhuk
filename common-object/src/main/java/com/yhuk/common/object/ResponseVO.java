package com.yhuk.common.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yhuk.common.object.status.CodeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description TODO
 * @Author gaozhi.liu
 * @Date 2019/6/4 10:52
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVO<T> {

    private static final long serialVersionUID = -5327212050370584991L;
    private static final CodeEnum success = CodeEnum.SUCCESS;

    /**
     * 响应码
     */
    private int code;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 响应描述
     */
    private String message;

    public ResponseVO() {
    }

    /**
     * 成功响应且带响应数据
     *
     * @param data
     */
    public ResponseVO(T data) {
        this.code = success.getCode();
        this.message = success.getMessage();
        this.data = data;
    }

    /**
     * 只带响应code和desc
     *
     * @param code
     */
    public ResponseVO(Code code, String detail) {
        this.code = code.getCode();
        this.message = detail;
    }
    public ResponseVO(Code code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }
}


