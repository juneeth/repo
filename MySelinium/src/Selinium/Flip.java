package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        ////button[@class='_2AkmmA _29YdH8']
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions act = new Actions (driver);
		act.moveToElement(driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/span[1]"))).build().perform();
		driver.findElement(By.linkText("Mi")).click();
		
		
		
		
	}

}
