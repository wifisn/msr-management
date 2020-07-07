package com.msr.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 宋永楠
 * @version v1.0
 * @Package com.msr.thirdparty
 * @date 2020/7/8 6:19
 * @Copyright @ msr
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ThirdpartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThirdpartyApplication.class,args);
    }
}
