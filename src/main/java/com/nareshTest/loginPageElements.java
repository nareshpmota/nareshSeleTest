package com.nareshTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class loginPageElements {

	@FindBy (xpath="//input[@placeholder='Email Address']")
	private WebElement username;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement submitBtn;
	
	public WebElement getUsername() {
		return this.username;
	}
	public WebElement getPassword() {
		return this.password;
	}
	public WebElement getSubmit() {
		return this.submitBtn;
	}
}
