package mar18;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SpecificWindow {

	@Test
	public void swindow()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		Reporter.log(parent);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		Thread.sleep(3000);
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(win.get(2));
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("ramu");
		driver.findElement(By.name("pass")).sendKeys("123@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
