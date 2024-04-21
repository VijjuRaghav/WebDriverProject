package mar20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleCheckBox {

	@Test
	public void mcheckbox()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("file:///D:/checkbox_1_lyst7599.html");
		Thread.sleep(3000);
		List<WebElement> all_cb=driver.findElements(By.xpath("//*[@type='checkbox']"));
		Reporter.log("No of cb are::"+all_cb.size());
		for (WebElement each : all_cb) {
			boolean value=each.isSelected();
			String cbname=each.getAttribute("value");
			Reporter.log(cbname);
			Thread.sleep(3000);
			each.click();
		}
		Thread.sleep(3000);
		driver.quit();
	}
	

}
