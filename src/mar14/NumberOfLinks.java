package mar14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NumberOfLinks {

	@Test
	public void nlinks()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.rediff.com/");
		Thread.sleep(3000);
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		Reporter.log("No Of Links are::"+all_links.size());
		Thread.sleep(3000);
		for (WebElement each : all_links)
		{
			Thread.sleep(100);
			Reporter.log(each.getText());
		}
		driver.quit();
	}

}
