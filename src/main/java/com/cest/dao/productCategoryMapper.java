package com.cest.dao;

import com.cest.entity.productCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface productCategoryMapper {
    int insert(productCategory record);

    int insertSelective(productCategory record);
}