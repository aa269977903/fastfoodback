package com.cest.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class sellerInfo implements Serializable {
    private String id;

    private String username;

    private String password;

    private String openid;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}