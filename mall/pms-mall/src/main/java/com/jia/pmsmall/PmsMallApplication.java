package com.jia.pmsmall;

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
@MapperScan("com.jia.pmsmall.mapper")
@EnableDiscoveryClient
public class PmsMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsMallApplication.class, args);
    }

}
