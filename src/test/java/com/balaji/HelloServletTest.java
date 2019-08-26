package com.balaji;

import org.junit.Test;


public class HelloServletTest {

	@Test
	public void testGetName() {
		HelloServlet obj=new HelloServlet();
		obj.getName(null).equals("Null Value");
	}
}
