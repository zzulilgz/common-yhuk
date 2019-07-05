package com.yhuk.common.object;

/**
 * @Description TODO
 * @Author gaozhi.liu
 * @Date 2019/6/4 10:25
 * @Version 1.0
 **/
public interface Code {

    /**
     * 获取响应码
     *
     * @return
     */
    int getCode();

    /**
     * 获取响应码描述
     *
     * @return
     */
    String getMessage();
}
