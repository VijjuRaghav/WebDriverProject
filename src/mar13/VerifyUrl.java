package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyUrl {

	@Test
	public void vurl()throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		String Expected="https://";
		String Actual=driver.getCurrentUrl();
		if(Expected.startsWith(Actual))
		{
			Reporter.log("url is secured"+Expected+"   "+Actual);
		}
		else
		{
			Reporter.log("url is local"+Expected+"   "+Actual);
		}
		driver.quit();
	}

}
