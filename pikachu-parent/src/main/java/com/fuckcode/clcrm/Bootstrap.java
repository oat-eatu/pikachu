package com.fuckcode.clcrm;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.fuckcode.clcrm.core.mapper")
@EnableSwagger2Doc
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
