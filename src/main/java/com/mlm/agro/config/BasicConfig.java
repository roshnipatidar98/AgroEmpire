package com.mlm.agro.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfig {
	
	@Value("${spring.datasource.driver}")
	private String mysqlDriver;
	
	@Value("${spring.datasource.url}")
	private String mysqlUrl;
	
	@Value("${spring.datasource.username}")
	private String mysqlUserName;
	
	@Value("${spring.datasource.password}")
	private String mysqlPassword;
	
	
	
    @Bean("dataSource")
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(mysqlDriver);
        dataSourceBuilder.url(mysqlUrl);
        dataSourceBuilder.username(mysqlUserName);
        dataSourceBuilder.password(mysqlPassword);
        return dataSourceBuilder.build();
    }
}
