package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActualExpectedTitle {

	@Test
	public void title()throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		String Expected="google";
		String Actual=driver.getTitle();
		if (Expected.equalsIgnoreCase(Actual)) {
			Reporter.log("Title is Matched::"+Expected+"    "+Actual);
		}
		else
			{
			Reporter.log("Title is Not Matched::"+Expected+"    "+Actual);
			}
			driver.quit();
		}
	}


