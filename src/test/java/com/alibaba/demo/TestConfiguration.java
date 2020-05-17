package com.alibaba.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;

@Configuration
@ActiveProfiles("test")
public class TestConfiguration {
	public TestConfiguration() throws ManagedProcessException {
		DBConfigurationBuilder config = DBConfigurationBuilder.newBuilder();
		config.setPort(3306); // 0 => autom. detect free port
		DB db = DB.newEmbeddedDB(config.build());
		db.start();
	}
}
