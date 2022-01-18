package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenStaxLoginTesting {

	

	public  String LoginEmailValidate() {
			//set up ChromeDriver (the thing that controls the browser)
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\meich\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			//open webpage and fill out fields
			driver.get("https://openstax.org/accounts/i/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("login_form_email")).sendKeys("invalid@gmail.com");
			driver.findElement(By.id("login_form_password")).sendKeys("1234");
			driver.findElement(By.className("primary")).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement m = driver.findElement(By.className("invalid-message"));
			
			
		 	String actual = m.getText();
		 	System.out.println(actual);
		 	String expected = "We could not find your account. Please try again.";
		 	if(actual.equalsIgnoreCase(expected) ) System.out.println("error message sucessfully displayed");
		 	
		 	driver.quit();
		 	
		 	return actual;
	}
	
	public  String LoginPasswordValidate() {
		//set up ChromeDriver (the thing that controls the browser)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meich\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open webpage and fill out fields
		driver.get("https://openstax.org/accounts/i/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_form_email")).sendKeys("chixelpuf@gmail.com");
		driver.findElement(By.id("login_form_password")).sendKeys("1234");
		driver.findElement(By.className("primary")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement m = driver.findElement(By.className("invalid-message"));
		
		
	 	String actual = m.getText();
	 	System.out.println(actual);
	 	String expected = "The password you provided is incorrect.";
	 	if(actual.equalsIgnoreCase(expected) ) System.out.println("error message sucessfully displayed");
	 	
	 	driver.quit();
	 	
	 	return actual;
}

}
