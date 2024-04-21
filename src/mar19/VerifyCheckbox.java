package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyCheckbox {

	@Test
	public void vcheckbox()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		WebElement radiobutton=driver.findElement(By.name("remember"));
		boolean is_Selected=radiobutton.isSelected();
		Reporter.log("selected number is::"+is_Selected);
		Thread.sleep(4000);
		if(is_Selected)
		{
			radiobutton.click();
		}
		else
		{
			radiobutton.click();
		}
		Reporter.log("selected number is::"+is_Selected);
		Thread.sleep(3000);
		driver.quit();
	}

}
