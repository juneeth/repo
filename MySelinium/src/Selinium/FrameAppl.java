package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAppl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(("IF1"));
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"presscore-custom-menu-two-2\"]/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
         //IF1
		////ul[@id='primary-menu']//span[@class='menu-text'][contains(text(),'Software Testing Tutorial')]
		////*[@id="primary-menu"]/li[2]/ul/li[1]/a/span/span
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div/div[2]/ol/li[1]/a")).click();
		////*[@id="page"]/div[4]/div/div[2]/ol/li[1]/a
		////*[@id="page"]/div[4]/div/div[2]/ol/li[1]
		////*[@id="page"]/div[4]/div/div[2]/ol/li[1]/a
		
	}

}
