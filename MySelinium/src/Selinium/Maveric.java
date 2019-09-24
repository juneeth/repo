package Selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maveric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		Actionconnect.username(driver).sendKeys("juneethalam");
		Actionconnect.password(driver).sendKeys("ju@");
		Actionconnect.click(driver).click();*/
		driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys("juneethalam");
		driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys("junaid");
		String login=driver.findElement(By.xpath("//input[@value='Login']")).getAttribute("type");
		System.out.println(login);
		
		
	}
}