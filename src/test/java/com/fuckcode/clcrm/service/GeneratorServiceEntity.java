//package com.fuckcode.clcrm.service;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import org.junit.Test;
//
//import java.nio.file.Paths;
//
///**
// * @author dongyang.yu
// * @email dongyang.yu@anxincloud.com
// */
//public class GeneratorServiceEntity {
//
//    @Test
//    public void generateCode() throws ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String packageName = "com.doubleysoft.clcrm.core";
//        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
//        generateByTables(serviceNameStartWithI, packageName, "sms_template", "msg_record");
//    }
//
//    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
//        GlobalConfig config = new GlobalConfig();
//        String dbUrl = "jdbc:mysql://mysql.dev1.ctstest.com:3306/sms_gateway";
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.MYSQL)
//                .setUrl(dbUrl)
//                .setUsername("root")
//                .setPassword("111111")
//                .setDriverName("com.mysql.jdbc.Driver");
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig
//                .setCapitalMode(true)
//                .setEntityLombokModel(false)
//                .setDbColumnUnderline(true)
//                .setNaming(NamingStrategy.underline_to_camel)
//                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
//        String basePath = Paths.get(".").toAbsolutePath().toFile().getAbsolutePath();
//        config.setActiveRecord(false)
//                .setAuthor("dongyang.yu")
//                .setOutputDir(basePath + "/src/main/java/")
//                .setFileOverride(true);
//        if (!serviceNameStartWithI) {
//            config.setServiceName("%sService");
//            config.setSwagger2(true);
//        }
//        new AutoGenerator().setGlobalConfig(config)
//                .setDataSource(dataSourceConfig)
//                .setStrategy(strategyConfig)
//                .setPackageInfo(
//                        new PackageConfig()
//                                .setParent(packageName)
////                                .setController("controller")
//                                .setEntity("entity")
//                ).execute();
//    }
//
//    private void generateByTables(String packageName, String... tableNames) {
//        generateByTables(true, packageName, tableNames);
//    }
//}
