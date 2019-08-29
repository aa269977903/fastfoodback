package com.cest.dao;

import com.cest.entity.orderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface orderDetailMapper {
    int insert(orderDetail record);

    int insertSelective(orderDetail record);
}