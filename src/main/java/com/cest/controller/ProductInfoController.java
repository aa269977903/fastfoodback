package com.cest.controller;

import com.cest.entity.ProductInfo;
import com.cest.service.ProductInfoService;
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
    private ProductInfoService productInfoService;

    @RequestMapping("/")
    public String test() {
        List<ProductInfo> productInfos = productInfoService.queryAllmsg();
        System.out.println(111);
        return "Hello SpringBoot";
    }
}
