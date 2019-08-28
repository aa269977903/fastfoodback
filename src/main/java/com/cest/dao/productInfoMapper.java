package com.cest.dao;

import com.cest.entity.productInfo;

public interface productInfoMapper {
    int insert(productInfo record);

    int insertSelective(productInfo record);
}