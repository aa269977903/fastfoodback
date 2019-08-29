package com.cest.dao;

import com.cest.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoMapper {
    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> queryAllmsg();
}