package com.dhandapani.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dhandapani.junit.service.Greeting;
import com.dhandapani.junit.service.impl.GreetingImpl;

public class AppTest {

	
	private Greeting gi;

	@Before
	public void setUp() {
		System.err.println("setUp");
		gi = new GreetingImpl();
	}

	@After
	public void tearDown() {
		System.err.println("tearDown");
		gi = null;
	}

	@Test
	public void greetShouldReturnValidOuptut() {
		System.err.println("greetShouldReturnValidOuptut");
		String result = gi.greet("JUnit");
		assertNotNull(result);
		assertEquals("Hello JUnit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowIllegalArgumentExceptionIfNameIsNull() {
		System.err.println("greetShouldThrowIllegalArgumentExceptionIfNameIsNull");
		gi.greet(null);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void greetShouldThrowArrayIndexOutOfBoundsExceptionIfNameIsNull1() {
		System.err.println("greetShouldThrowArrayIndexOutOfBoundsExceptionIfNameIsNull1");
		gi.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowIllegalArgumentExceptionIfNameIsEmpty() {
		System.err.println("greetShouldThrowIllegalArgumentExceptionIfNameIsEmpty");
		gi.greet("");
	}

}
