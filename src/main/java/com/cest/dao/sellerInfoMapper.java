package com.cest.dao;

import com.cest.entity.sellerInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface sellerInfoMapper {
    int insert(sellerInfo record);

    int insertSelective(sellerInfo record);
}