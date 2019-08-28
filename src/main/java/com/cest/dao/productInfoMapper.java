package com.cest.dao;

import com.cest.entity.productInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productInfoMapper {
    int insert(productInfo record);

    int insertSelective(productInfo record);

    List<productInfo> queryAllmsg();
}