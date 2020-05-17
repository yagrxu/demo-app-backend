package com.alibaba.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import ch.vorburger.exec.ManagedProcessException;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class DemoApplicationTests {

	@Before
	public void init() throws ManagedProcessException {

	}

	@Test
	public void contextLoads() {
	}

}
