package Selinium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actionconnect {
	public static WebElement username(WebDriver driver )
	{
		WebElement ele = driver.findElement(By.xpath(" //input[@id='LoginForm_username']"));
		return ele;
		
	}
	public static WebElement password(WebDriver driver)
	{
		WebElement pass =driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		return pass;
		
	}
	public static WebElement click(WebDriver driver)
	{
		WebElement click=driver.findElement(By.xpath("//input[@value='Login']"));
		return click;
	}

}
