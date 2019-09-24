package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageFactorymain {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		PageFactorymethid page = new PageFactorymethid(driver);
		page.username1.sendKeys("juneethalama");
		page.password1.sendKeys("junaid12@");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
