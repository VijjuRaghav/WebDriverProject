package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PageTitle {

	@Test
	public void ptitle()throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/ ");
		Thread.sleep(5000);
		String pagetitle = driver.getTitle();
		Reporter.log(pagetitle);
		Reporter.log("page length::"+pagetitle.length());
		String url=driver.getCurrentUrl();
		Reporter.log(url);
		Reporter.log("url length::"+url.length());
		driver.quit();
		}

}
