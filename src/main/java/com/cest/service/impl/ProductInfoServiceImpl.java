package com.cest.service.impl;

import com.cest.dao.ProductInfoMapper;
import com.cest.entity.ProductInfo;
import com.cest.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cestlavie on 2019/8/29.
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public int insert(ProductInfo record) {
        return productInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductInfo record) {
        return productInfoMapper.insertSelective(record);
    }

    @Override
    public List<ProductInfo> queryAllmsg() {
        return productInfoMapper.queryAllmsg();
    }
}
