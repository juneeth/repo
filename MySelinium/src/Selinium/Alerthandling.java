package Selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(3000);
		///html/body/div[1]/div[5]/div[2]/div/div/p[3]/button
		driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();////*[@id="cookie_action_close_header"]
		//Alert alerthandling = driver.switchTo().alert();
		//alerthandling.accept();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/p[3]/button")).click();
		Alert alerthandling1 = driver.switchTo().alert();
		
		
		//alerthandling.dismiss();
		String alertbox =alerthandling1.getText();
		alerthandling1.dismiss();
		System.out.println(alertbox);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button")).click();
		Alert alertb =driver.switchTo().alert();
		String get= alertb.getText();
		alertb.accept();
		System.out.println(get);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button")).click();
		Alert popup = driver.switchTo().alert();
		popup.sendKeys("juneeth");
		String pop = popup.getText();
		popup.accept();
		System.out.println(pop);
		

	}

}
