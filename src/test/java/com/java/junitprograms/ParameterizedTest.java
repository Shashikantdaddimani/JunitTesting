package com.java.junitprograms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private String emailId;
	private boolean expected;

	public ParameterizedTest(String emailId, boolean expected) {

		this.emailId = emailId;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection data() {
		UserRegistration Object = new UserRegistration();
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com,", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true } });
	}

	@Test
	public void emailTest() {
		System.out.println(emailId);
		UserRegistration Object = new UserRegistration();
		assertEquals(true, Object.isValied(emailId));
	}

	@Parameterized.Parameters
	public void EmailTest(String EmailTest) {
		UserRegistration Object = new UserRegistration();
		String[] emailId = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
		for (int i = 0; i < emailId.length; i++) {
			assertTrue(Object.isValied(emailId[i]));
		}
	}

}
