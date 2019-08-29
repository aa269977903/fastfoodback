package com.cest.dao;

import com.cest.entity.ProductCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryMapper {
    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);
}