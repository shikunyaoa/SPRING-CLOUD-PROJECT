package com.sky.cloud.nacosdiscoverytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryTestApplication.class, args);
    }

    
    @org.springframework.web.bind.annotation.RestController
    public class RestController{
        
        @GetMapping(value = "/echo/{str}")
        public String echo(@PathVariable String str){
            return "Hello Nacos Discovery " + str;
        }
    }
}
