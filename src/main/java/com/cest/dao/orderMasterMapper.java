package com.cest.dao;

import com.cest.entity.orderMaster;

public interface orderMasterMapper {
    int insert(orderMaster record);

    int insertSelective(orderMaster record);
}