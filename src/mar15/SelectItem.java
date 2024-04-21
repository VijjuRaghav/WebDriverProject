package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SelectItem {

	@Test
	public void sitem()throws Throwable {
		String Item_Present="Automotive";
		Boolean Item_Exist=false;
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items=listbox.getOptions();
		Reporter.log(Item_Present, all_items.size());
		for (WebElement each : all_items) {
			String Actual_Items=each.getText();
			Thread.sleep(3000);
			Reporter.log(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Item_Present))
			{
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)
		{
			Reporter.log(Item_Present+"  "+"item exist in listbox");
		}
		else
		{
			Reporter.log(Item_Present+"  "+"item does not exist in listbox");	
		}
		Thread.sleep(3000);
		driver.quit();
	}
	

}
