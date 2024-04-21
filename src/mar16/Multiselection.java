package mar16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiselection {

	@Test
	public void mselection() throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("\"D:\\MultiListboxHtmlpage_lyst8730.html\"");
		Thread.sleep(3000);
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		boolean value=dropdown.isMultiple();
		Reporter.log("multiselection is ::"+value);
		for(int i=0;i<=8;i++)
		{
			Thread.sleep(3000);
			dropdown.selectByIndex(i);
		}
		dropdown.deselectByVisibleText("Red");
		Thread.sleep(3000);
		dropdown.deselectByIndex(4);
		Thread.sleep(3000);
		dropdown.deselectAll();
		Thread.sleep(3000);
		driver.quit();
	}

}
