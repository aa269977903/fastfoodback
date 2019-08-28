package com.cest.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class productCategory implements Serializable {
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}