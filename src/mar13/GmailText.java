package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GmailText {

	@Test
	public void gtext()throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		//String rad=driver.findElement(By.linkText("Gmail")).getText();
		//String rad2=driver.findElement(By.linkText("Gmail")).getAttribute();
		String gmailtext1 =driver.findElement(By.linkText("Gmail")).getText();
		Reporter.log(gmailtext1);
		String url=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		Reporter.log(url);
	driver.quit();
	}
}
