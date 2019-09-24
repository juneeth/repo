package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//firstcommit message
		//this the second window
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		driver.findElement(By.xpath("//*[@id=\"menu_download\"]/a")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element =driver.findElement(By.xpath("//a[contains(text(),'Google Chrome Driver')]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",element );
		Thread.sleep(2000);
		 String ele=element.getText();
		 System.out.println("the element name is "+ele);
		 WebElement element1 =driver.findElement(By.xpath("//a[@title='Selenium Projects']"));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].scrollIntoView();",element1 );
		 String ele1=element1.getText();
		 System.out.println("the element name is "+ele1);
		 driver.findElement(By.xpath("//a[contains(text(),'3.141.59')]")).click();	
		
		
	}

}
