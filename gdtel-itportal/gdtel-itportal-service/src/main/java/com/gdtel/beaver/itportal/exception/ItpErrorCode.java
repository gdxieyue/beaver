package com.gdtel.beaver.itportal.exception;

import com.gdtel.common.base.enums.IErrorEnum;

/**
 * 通用错误码
 */
public enum ItpErrorCode implements IErrorEnum {

    OK(0, ""),
    FAIL(-1, "操作失败"),
    RPC_ERROR(-2,"远程调度失败"),
    USER_NOT_FOUND(1000,"用户不存在"),
    USER_PASSWORD_ERROR(1001,"密码错误"),
    GET_TOKEN_FAIL(1002,"获取token失败"),
    TOKEN_IS_NOT_MATCH_USER(1003,"请使用自己的token进行接口请求"),
    ;
    private int code;
    private String msg;


    ItpErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}
