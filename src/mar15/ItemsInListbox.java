package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ItemsInListbox {

	@Test
	public void ilistbox()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items=listbox.getOptions();
		Reporter.log("No of Items ::"+all_items);
		Thread.sleep(4000);
		for (WebElement each : all_items) {
			Thread.sleep(3000);
			Reporter.log(each.getText());
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
