package com.cest.service;

import com.cest.entity.ProductInfo;

import java.util.List;


public interface ProductInfoService {
    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> queryAllmsg();
}