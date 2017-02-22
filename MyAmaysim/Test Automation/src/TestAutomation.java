import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Test;

public class TestAutomation {
	
	WebDriver driver;
	
	@Test
	public void MyAmaysim() {
		 
       //set the path for gecko driver
       System.setProperty("webdriver.gecko.driver","C:\\MyAmaysim\\geckodriver\\geckodriver.exe");
          
       // Create a new instance of the Firefox driver
	   driver = new FirefoxDriver();
		
       //Launch the Online Store Website
	   driver.get("https://accounts.amaysim.com.au/identity/login");
		          
       // Enter userd id
       WebElement element = driver.findElement(By.id("mobile_number"));
       element.clear(); 
       element.sendKeys("0468827174");
          
       //wait 5 secs for  userid to be entered
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
       //Enter Password
       WebElement element1 = driver.findElement(By.id("password"));
       element1.clear();
       element1.sendKeys("theHoff34");
          
       //Submit button
       element.submit();
         
		// close the web browser
       driver.close();
       System.out.println("Test script executed successfully.");

       // terminate the program
       System.exit(0);		 
		  
	}	
}