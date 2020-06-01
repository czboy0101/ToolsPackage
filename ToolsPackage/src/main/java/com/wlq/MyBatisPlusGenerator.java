package com.wlq;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.io.IOException;
/**
 * MyBatisPlusGenerator代码生成工具
 * */
public class MyBatisPlusGenerator {

    //项目在硬盘上的基础路径
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    //JAVA文件路径
    private static final String JAVA_PATH = "/src/main/java";
    //资源文件路径
    private static final String RESOURCES_PATH = "/src/main/resources";

    public  static void CodeGenerator() throws IOException {
        String FilePuth = PROJECT_PATH+JAVA_PATH;
        //全局配置
        GlobalConfig config = new GlobalConfig();
        //是否支持AR模式
        config.setActiveRecord(true)
                //作者
                .setAuthor("MyBatisPlus")
                //文件覆盖
                .setOutputDir(FilePuth)
                //文件覆盖
                .setFileOverride(true)
                //设置生成的service接口的名字的首字母是否为I (案列:IEmployeeService)
                .setServiceName("%sService")
                //生成基本的resultMap
                .setBaseResultMap(true)
                //生成基本的SQL片段
                .setBaseColumnList(true);
        //数据源配置
        DataSourceConfig dsConfig  = new DataSourceConfig();
        //设置数据库类型
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://127.0.0.1:3306/wlq")
                .setUsername("root")
                .setPassword("root");
        //策略配置globalConfiguration
        //数据表
        String[] db_tables = {"sys_user","sys_role","sys_menu","sys_relation","sys_dept"};
        StrategyConfig stConfig = new StrategyConfig();
        //全局大写命名
        stConfig.setCapitalMode(true)
                //指定表名 字段名是否使用下划线
                .setDbColumnUnderline(true)
                //数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                //生成的表
                .setInclude(db_tables);
        //包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.wlq.modules.tmp")
                .setMapper("mapper")//dao
                .setService("service")//servcie
                .setController("controller")//controller
                .setEntity("model")
                .setXml("mapper");//mapper.xml
        //整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        //执行
        ag.execute();
    }

    public static void main(String[] args) throws Exception {
        CodeGenerator();
    }

}
