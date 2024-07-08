package com.sky.exception;

/**
 * exception目录下定义异常类
 * 账号被锁定异常
 */
public class AccountLockedException extends BaseException {

    public AccountLockedException() {
    }

    public AccountLockedException(String msg) {
        super(msg);
    }

}
