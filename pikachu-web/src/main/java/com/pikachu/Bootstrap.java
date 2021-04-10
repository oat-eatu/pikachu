package com.pikachu;//package com.fuckcode.clcrm;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dongyang.yu
 */
//@EnableTransactionManagement
@SpringBootApplication
//@MapperScan(basePackages = "com.fuckcode.clcrm.core.mapper")
@EnableSwagger2Doc
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
