package com.cest.dao;

import com.cest.entity.SellerInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerInfoMapper {
    int insert(SellerInfo record);

    int insertSelective(SellerInfo record);
}