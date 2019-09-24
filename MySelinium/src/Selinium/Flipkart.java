package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement Element =driver.findElement(By.xpath(" //input[@placeholder='Search for products, brands and more']"));
		Element.sendKeys("Redmi note 7 pro mobile");
		////*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button
            
	
	}

}
