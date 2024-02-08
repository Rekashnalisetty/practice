package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
