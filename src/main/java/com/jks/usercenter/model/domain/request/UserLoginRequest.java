package com.jks.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {


    private static final long serialVersionUID = 274442891340855380L;
    //前端需要接收的请求、前端需要传入的参数
    private String userAccount;

    private String userPassword;
}
