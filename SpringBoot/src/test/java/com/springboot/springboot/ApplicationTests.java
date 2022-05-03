package com.springboot.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.springboot.service.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void testService() {
		Service s=context.getBean(Service.class);
		s.save();
	}

}