package com.cest.dao;

import com.cest.entity.sellerInfo;

public interface sellerInfoMapper {
    int insert(sellerInfo record);

    int insertSelective(sellerInfo record);
}