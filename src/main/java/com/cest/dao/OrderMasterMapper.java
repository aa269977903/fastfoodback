package com.cest.dao;

import com.cest.entity.OrderMaster;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMasterMapper {
    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);
}