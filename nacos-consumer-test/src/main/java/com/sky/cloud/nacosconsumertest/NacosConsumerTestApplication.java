package com.sky.cloud.nacosconsumertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerTestApplication.class, args);
    }
    
    @RestController
    public class NacosController{
        
        @Autowired
        private RestTemplate restTemplate;
        
        @Autowired
        private LoadBalancerClient loadBalancerClient;
        
        @Value("${spring.application.name}")
        private String appName;
        
        @GetMapping("/echo/app-name")
        public String echoAppName(){
            ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
            String path = String.format("http://%s:%s/echo/%s", serviceInstance.getHost(), serviceInstance.getPort(), appName);
            System.out.println("request path: " + path);
            return restTemplate.getForObject(path, String.class);
        }
    }
    
    
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    
}
