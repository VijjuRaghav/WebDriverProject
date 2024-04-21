package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrivingTableData {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		WebElement wetable=driver.findElement(By.className("w3-example"));
		List<WebElement> rows,cols;
		rows=wetable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(3000);
		for (WebElement eachrow : rows) {
			Thread.sleep(3000);
			cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcol : cols) {
				Thread.sleep(3000);
				System.out.println(eachcol.getText());
			}
		System.out.println("   ");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
