package com.alibaba.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class DatabaseConfiguration {

	@Value("${DB_USER_NAME}")
	String userName;

	@Value("${DB_PASSWORD}")
	String password;

	@Value("${DB_DRIVER}")
	String dbDriver;

	@Value("${DB_URL}")
	String dbUrl;

	@LiquibaseDataSource
	@Bean
	public DataSource liquibaseDataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(dbDriver);
		dataSourceBuilder.url("jdbc:h2:mem:test");
		dataSourceBuilder.username(userName);
		dataSourceBuilder.password(password);
		dataSourceBuilder.url(dbUrl);
		DataSource ds = dataSourceBuilder.build();
//		if (ds instanceof HikariDataSource) {
//			((HikariDataSource) ds).setMaximumPoolSize(2);
//			((HikariDataSource) ds).setPoolName("Liquibase Pool");
//		}
		return ds;
	}

}
