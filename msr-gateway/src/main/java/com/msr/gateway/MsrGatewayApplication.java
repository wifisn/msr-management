package com.msr.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 宋永楠
 * @version v1.0
 * @Package com.msr.gateway
 * @date 2020/7/8 5:53
 * @Copyright @ msr
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MsrGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsrGatewayApplication.class, args);
    }
}