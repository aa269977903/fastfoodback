package com.cest.dao;

import com.cest.entity.orderMaster;
import org.springframework.stereotype.Repository;

@Repository
public interface orderMasterMapper {
    int insert(orderMaster record);

    int insertSelective(orderMaster record);
}