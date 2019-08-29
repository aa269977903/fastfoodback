package com.cest.config;

import com.cest.dao.ProductInfoMapper;
import com.cest.entity.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cestlavie on 2019/8/29.
 */
@RestController
public class ProductInfoController {

    @Autowired
    private ProductInfoMapper productInfoMappers;

    @RequestMapping("/")
    public String test() {
        List<ProductInfo> productInfos = productInfoMappers.queryAllmsg();
        System.out.println(111);
        return "Hello SpringBoot";
    }
}
