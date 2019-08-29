package com.cest.fastfoodback;

import com.cest.dao.ProductInfoMapper;
import com.cest.entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@MapperScan("com.cest")
@Slf4j
public class FastfoodbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastfoodbackApplication.class, args);
        log.info("http://localhost:8090");
    }

    @Autowired
    private ProductInfoMapper productInfoMappers;

    @RequestMapping("/")
    public String test() {
        List<ProductInfo> productInfos = productInfoMappers.queryAllmsg();
        System.out.println(111);
        return "Hello SpringBoot";
    }
}
