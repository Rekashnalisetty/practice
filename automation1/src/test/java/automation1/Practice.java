package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		System.out.println("page is displayed");
		driver.close();

	}

}
