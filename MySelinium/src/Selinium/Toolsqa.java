package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Toolsqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		Thread.sleep(3000);
		Actions Element = new Actions(driver);
		Element.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]/span[1]"))).build().perform();
		Thread.sleep(2000);
		Element.moveToElement(driver.findElement(By.linkText("Software Testing Tutorial"))).click().build().perform();
		//Element.click().build().perform();

	}

}
