package com.cest.dao;

import com.cest.entity.orderDetail;

public interface orderDetailMapper {
    int insert(orderDetail record);

    int insertSelective(orderDetail record);
}