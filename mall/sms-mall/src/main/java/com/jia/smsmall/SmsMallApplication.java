package com.jia.smsmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.oas.annotations.EnableOpenApi;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 10696
 */

@EnableOpenApi
@SpringBootApplication
@MapperScan("com.jia.smsmall.mapper")
@EnableDiscoveryClient
public class SmsMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsMallApplication.class, args);
    }

}
