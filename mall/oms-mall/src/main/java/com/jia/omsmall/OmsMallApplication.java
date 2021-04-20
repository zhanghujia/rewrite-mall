package com.jia.omsmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.oas.annotations.EnableOpenApi;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 10696
 */

@EnableFeignClients(basePackages = "com.jia.omsmall.feign")
@EnableOpenApi
@SpringBootApplication
@MapperScan("com.jia.omsmall.mapper")
@EnableDiscoveryClient
public class OmsMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmsMallApplication.class, args);
    }

}
