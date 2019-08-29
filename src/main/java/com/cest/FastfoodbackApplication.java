package com.cest;

import com.cest.entity.ProductInfo;
import com.cest.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@MapperScan("com.cest.dao")
@RestController
@Slf4j
public class FastfoodbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastfoodbackApplication.class, args);
        log.info("http://localhost:8090");
    }



}
