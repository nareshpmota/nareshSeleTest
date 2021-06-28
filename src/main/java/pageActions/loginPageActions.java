package pageActions;


import org.openqa.selenium.support.PageFactory;
import com.nareshTest.loginPageElements;
import utilities.pageObject;
public class loginPageActions extends pageObject{

	protected loginPageElements elements;
	private loginPageActions(){
	  
       elements= PageFactory.initElements(driver, loginPageElements.class);

	}
	public static loginPageActions using()  {
		return new loginPageActions();
	}
	public loginPageActions launch() {
		driver.get("https://ccbwui.3didemo.com/#/homepage");
		return this;
	}
	public loginPageActions enterUsername() {
	     this.elements.getUsername().sendKeys("inspector@3diemail.com");
		return this;
	}
	public loginPageActions enterPassword() {
	     this.elements.getPassword().sendKeys("Demo1234");
		return this;
	}
	public loginPageActions submitLogin() {
	     this.elements.getSubmit().click();
		return this;
	}
}
