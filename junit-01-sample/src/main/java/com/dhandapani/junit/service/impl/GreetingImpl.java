package com.dhandapani.junit.service.impl;

import com.dhandapani.junit.service.Greeting;

public class GreetingImpl implements Greeting {

	public String greet(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}
}
