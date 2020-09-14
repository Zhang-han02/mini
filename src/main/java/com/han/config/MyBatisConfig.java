package com.han.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 当mapper文件过多时 不需在没有借口上加@Mapper注解，使用全局的
 * Created by macro on 16:47 2020/9/9
 */
//配置文件声明
@Configuration
//开启事务
@EnableTransactionManagement
@MapperScan("com.han.mapper")
public class MyBatisConfig {
}
