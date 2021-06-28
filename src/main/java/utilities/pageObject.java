package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pageObject {
	
 protected static WebDriver driver; 
 
       @BeforeClass
	   public static void setUp() {
	    	System.out.println("In Driver");
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize(); 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
	     
	   }
	   
	   @AfterClass
	    public static void tearDown(){
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       driver.close();
	    }
}
