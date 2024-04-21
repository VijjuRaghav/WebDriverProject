package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandlingAlert1 {

	@Test
	public void halerts()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		String alert_message=driver.switchTo().alert().getText();
		Reporter.log(alert_message);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String alert_message1=driver.switchTo().alert().getText();
		Reporter.log(alert_message1);
		Thread.sleep(3000);
		driver.quit();
	}

}
