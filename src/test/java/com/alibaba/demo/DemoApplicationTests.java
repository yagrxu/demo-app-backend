package com.alibaba.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class DemoApplicationTests {

	@Before
	public void init() throws ManagedProcessException {
		DBConfigurationBuilder config = DBConfigurationBuilder.newBuilder();
		config.setPort(3306); // 0 => autom. detect free port
		DB db = DB.newEmbeddedDB(config.build());
		db.start();
	}

	@Test
	public void contextLoads() {
	}

}
