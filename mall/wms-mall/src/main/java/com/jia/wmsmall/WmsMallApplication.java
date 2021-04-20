package com.jia.wmsmall;

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
@MapperScan("com.jia.wmsmall.mapper")
@EnableDiscoveryClient
public class WmsMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsMallApplication.class, args);
    }

}
