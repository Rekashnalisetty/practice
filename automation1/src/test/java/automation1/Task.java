package automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement mouseOperationPerform = driver.findElement(By.xpath("//span[@class='nav-line-2 ']//span[@style='visibility: visible;']"));

		Actions action = new Actions(driver);
		action.moveToElement(mouseOperationPerform).build().perform();
		action.click();
		mouseOperationPerform.click();
		if (driver.getCurrentUrl().contains("https://www.amazon.in/ap/signin")) {
			System.out.println("Mouse over was handled sucessfully in sign in page");
		} else {
			System.out.println("Mouse over handling Failed in sign in page");
		}
		driver.quit();
	}

}
