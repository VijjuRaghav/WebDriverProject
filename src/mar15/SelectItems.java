package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SelectItems {

	@Test
	public void sitems()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		Select daylistbox=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		Boolean value=daylistbox.isMultiple();
		Reporter.log("date of birth is::"+value);
		daylistbox.selectByIndex(23);
		Thread.sleep(3000);
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(3000);
		yearlistbox.selectByVisibleText("2000");
		Thread.sleep(3000);
		driver.quit();
		}

}
