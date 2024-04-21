package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginDetails {

	@Test
	public void ldetails()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement objuser=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		objuser.clear();
		objuser.sendKeys("Admin");
		String username=objuser.getAttribute("value");
		Thread.sleep(3000);
		WebElement objpass=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		objpass.clear();
		objpass.sendKeys("admin123");
		String password=objpass.getAttribute("value");
		Reporter.log(username+"  "+password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		String Expected="index";
		String Actual=driver.getCurrentUrl();	
		if(Actual.contains(Expected))
		{
			Reporter.log("username and password are valid::"+Expected+"  "+Actual);
		}
		else
		{
		WebElement error_message=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		Reporter.log(error_message+"  "+Expected+" "+Actual);
		}
		Thread.sleep(4000);
		driver.quit();
		}
        
}
