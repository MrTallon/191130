package com.base.crud;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

/**
 * Mybatis-Plus 自动生成测试用例
 *
 * @author yangbo
 * @version v1.0.0
 * @date 2019-12-02 22:08
 */
class AutoCreate {
    @Test
    void testGen() {

        //1.全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)//AR模型
                .setAuthor("YangBo")//作者
                .setOutputDir("/Users/yangbo/Work/code/java/191130/base/src/main/java")//生成路径
                .setFileOverride(true)//覆盖
                .setIdType(IdType.AUTO)//主键自增策略
                .setServiceName("%sService")
                .setBaseResultMap(true)//xml
                .setBaseColumnList(true);//xml

        //2.数据源配置
        DataSourceConfig ds = new DataSourceConfig();
        ds.setDbType(DbType.MYSQL)
                //com.mysql.cj.jdbc.Driver
                //com.mysql.jdbc.Driver
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://42.56.89.59:3306/test")
                .setUsername("root")
                .setPassword("123456");

        //3.策略配置
        StrategyConfig sc = new StrategyConfig();
        sc.setCapitalMode(true)//全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//驼峰
                .setEntityLombokModel(true)
                .setTablePrefix("table_") ;//前缀
//                .setInclude("tb_content");

        //4.包名策略配置
        PackageConfig pk = new PackageConfig();
        pk.setParent("mp")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("beans")
                .setXml("dao");

        //5.整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(ds)
                .setStrategy(sc)
                .setPackageInfo(pk);

        //6.执行
        ag.execute();
    }
}
