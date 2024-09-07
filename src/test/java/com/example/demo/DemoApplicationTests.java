package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(DemoApplicationTests.class);


	@Test
	public contextLoads() {
		logger.info("Test Case Executing...");
		logger.info("Another Test Case Executed Second Test Case Exceuting..");
		assertEquals(true,true);
	}

}
