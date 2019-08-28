package com.cest.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class productInfo implements Serializable {
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Byte productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}