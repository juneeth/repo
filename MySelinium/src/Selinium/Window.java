package Selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		Thread.sleep(3000);
		String mainwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
        Set<String> manywindow = driver.getWindowHandles();
        for (String newwindow : manywindow)
        {
			if(!mainwindow.equals(newwindow)) {
				driver.switchTo().window(newwindow);
				driver.close();
			}
		}

	}

}
