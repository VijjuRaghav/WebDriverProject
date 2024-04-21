package mar18;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChildParentWindowHandle {

	@Test
	public void cpwhandle() throws Throwable {
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
		Set<String> allwins=driver.getWindowHandles();
		Reporter.log("allwins are::"+allwins);
		for (String each : allwins) {
			if(!parent.equals(each))
			{
				Thread.sleep(3000);
				String pagetitle1=driver.switchTo().window(each).getTitle();
				Reporter.log(pagetitle1);
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Select element=new  Select(driver.findElement(By.id("year")));
		List<WebElement> all_items=element.getOptions();
		Reporter.log("No of Items are::"+all_items.size());
		for (WebElement each : all_items) {
			Thread.sleep(3000);
			Reporter.log(each.getText());
		}
		driver.quit();
	}

}
