package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyWebelement {

	@Test
	public void vweblement()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		WebElement firstname=driver.findElement(By.name("firstname"));
		boolean is_enabled=firstname.isEnabled();
		Reporter.log("person details is::"+is_enabled);
		Thread.sleep(4000);
		WebElement emailaddress=driver.findElement(By.name("reg_email_confirmation__"));
		boolean is_displayed=emailaddress.isDisplayed();
		Reporter.log("display details::"+is_displayed);
		Thread.sleep(4000);
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='1']"));
		boolean is_Selected=radiobutton.isSelected();
		Reporter.log("selected buttons are::"+is_Selected);
		Thread.sleep(4000);
		driver.quit();
	}

}
