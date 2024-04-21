package mar14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Navigations {

	@Test
	public void nactions()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Reporter.log("pagetitle1 "+driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		Reporter.log("pagetitle2 "+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().back();
		Reporter.log("pagetitle3 "+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().forward();
		Reporter.log("pagetitle4 "+driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.quit();
	}

}
