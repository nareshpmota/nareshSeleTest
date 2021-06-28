package com.nareshTest;


import org.junit.Test;
import pageActions.loginPageActions;
import utilities.pageObject;
public class loginTest extends pageObject{
   
	@Test
	public void inspectorLogin() {
		loginPageActions.using()
		                .launch()
		                .enterUsername()
		                .enterPassword()
		                .submitLogin();                 
	}
	
}
