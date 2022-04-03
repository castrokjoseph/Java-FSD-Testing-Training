package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("y")// OrderDAOImpl x=new OrderDAOImpl();
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO createOrder()");

	}

}
