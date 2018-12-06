package com.lyyzoo.sunny.core.exception;

import com.lyyzoo.sunny.core.constant.BaseResultEnums;

/**
 * 未登录异常
 */
public class NotLoginException extends RuntimeException {
    private static final long serialVersionUID = -7084125757017246513L;

    public NotLoginException() {
        super(BaseResultEnums.NOT_LOGIN.code());
    }

}
