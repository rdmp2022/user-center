package com.jks.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -6992697764747348753L;

    //前端需要接收的请求、前端需要传入的参数
    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
