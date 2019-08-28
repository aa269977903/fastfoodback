package com.cest.dao;

import com.cest.entity.productCategory;

public interface productCategoryMapper {
    int insert(productCategory record);

    int insertSelective(productCategory record);
}