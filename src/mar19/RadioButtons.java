package mar19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RadioButtons {

	@Test
	public void rbuttons()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		List<WebElement> rb=driver.findElements(By.xpath("//li[contains(@class,'wrapFilter')]"));
		for (WebElement each : rb) {
			Reporter.log(each.getText());
		}
		driver.quit();
	}

}
