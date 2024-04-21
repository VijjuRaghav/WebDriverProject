package mar25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RetriveSpecificDataLine {

	@Test
	public void rsdataline()throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		String tabletext=driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[5]/td[3]")).getText();
		String tabletext1=driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[5]/td[2]")).getText();
		Reporter.log(tabletext+"   "+tabletext1);
		driver.quit();
	}

}
