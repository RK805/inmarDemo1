package com.datadriven.objects;

import org.openqa.selenium.By;

/**
 * This Java Class provides Element Ids
 * 
 * @author Rama
 *
 */

public class Locators {

	public static class HomePage {

		public static By userName = By.cssSelector("#uname");
		public static By email = By.cssSelector("#email");
		public static By passWord = By.cssSelector("#pass");
		public static By conPassword = By.cssSelector("#cpass");
		public static By stepOneBtn = By
				.xpath("//div[@class='form-group signUpForm-step-1']//button[normalize-space(.)='Next']");
		public static By fName = By.cssSelector("#fname");
		public static By lName = By.cssSelector("#lname");
		public static By gender = By.cssSelector("#gender");
		public static By optMale = By.xpath("//option[@value='Male']");
		public static By optFemal = By.xpath("//option[@value='Femal']");
		public static By birthDate = By.cssSelector("#birthdate");
		public static By Aaddress = By.cssSelector("#address");
		public static By phoneNuber = By.cssSelector("#phone");
		public static By preferedContact1 = By.xpath("//label[@for='preferedcontact1']");
		public static By preferedContact2 = By.xpath("//label[@for='preferedcontact2']");
		public static By step2Btn = By
				.xpath("//div[@class='form-group signUpForm-step-2']//button[normalize-space(.)='Next']");
		public static By paymentType = By.cssSelector("#paymenttype");
		public static By optMasterCard = By.xpath("//option[@value='Master Card']");
		public static By optVisaCard = By.xpath("//option[@value='Visa Card']");
		public static By carduserName = By.cssSelector("#hname");
		public static By cardNumber = By.cssSelector("#cardnumber");
		public static By cvcNumber = By.cssSelector("#cvc");
		public static By expirydate = By.cssSelector("#expirydate");
		public static By agreeTerm = By.xpath("//label[@for='aggre']");
		public static By step3Btn = By
				.xpath("//div[@class='form-group signUpForm-step-3']//button[normalize-space(.)='Next']");
		public static By confirm = By.cssSelector(".confirm");
		// Error
		public static By mandatoryError = By.xpath("//div[@class='help-block with-errors mandatory-error']//li");
		public static By userNameErr = By.xpath("//div[@class='form-group validuname has-error has-danger']//li");
		public static By emailErr = By.xpath("//div[@class='form-group validemail has-error has-danger']//li");
		public static By passWordErr = By.xpath("//div[@class='form-group validpass has-error has-danger']//li");
		public static By rePassWordErr = By.xpath("//div[@class='form-group has-error has-danger']//li");
		public static By popUpMessage = By.xpath("//div[@class='sa-icon sa-success']//following-sibling::p");

	}

	public static class RegisterationPageOR {

	}

}
