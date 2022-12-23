package com.java.junitprograms;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration regitration = new UserRegistration();
	/*
	 * Testing for FirstName using happy test and sad test methods
	 * HappyTest case Validate the Entry successfully
	 * Sadtest case Fails the Entry
	 */
	@Test
	public void happyTestFirstName()
	{
		boolean result = regitration.firstName("Shashikant");
		Assert.assertEquals(true, result);
	}
	@Test
	public void sadTestFirstName()
	{
		boolean result = regitration.firstName("kant");
		Assert.assertEquals(false, result);
	}
	/*
	 * Testing for LastName using happy test and sad test methods
	 * HappyTest case Validate the Entry successfully
	 * Sadtest case Fails the Entry
	 */
	@Test
	public void happyTestLastName() {
		boolean result =regitration.lastName("Daddimani");
		Assert.assertEquals(true, result);
	}
	@Test
	public void sadTestLastNmae() {
		boolean result =regitration.lastName("daddimani");
		Assert.assertEquals(false, result);
	}
	/*
	 * Testing for EmailId using happy test and sad test methods
	 * HappyTest case Validate the Entry successfully
	 * Sadtest case Fails the Entry
	 */
	@Test
	public void happyTestEmailId() {
		boolean result = regitration .emailId("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}
	@Test
	public void sadTestEmailId() {
		boolean result = regitration.emailId("Abc.1xy@.bl.src.in");
		Assert.assertEquals(false, result);
	}
	/*
	 * Testing for MobileNumber using Happy test and Sad test methods
	 * HappyTest case Validate the Entry successfully
	 * Sadtest case Fails the Entry
	 */
	@Test
	public void happyTestMobileNumber() {
		boolean result = regitration.mobileNumber("91 9113264303");
		Assert.assertEquals(true, result);
	}
	@Test
	public void sadTestMobileNumber() {
		boolean result = regitration.mobileNumber("91 5113264303");
		Assert.assertEquals(false, result);
   }
	/*
	 * Testing for Password using happy test and sad test methods
	 * HappyTest case Validate the Entry successfully
	 * Sadtest case Fails the Entry
	 */
	@Test
    public void happyTestPassword(){
	 boolean result = regitration.passWord("Sdaddi@12");
	 Assert.assertEquals(true, result);
    }
	@Test
 	public void sadTestPassword(){
		boolean result = regitration.passWord("Sdaddi12");
		Assert.assertEquals(false, result);
	}

}
