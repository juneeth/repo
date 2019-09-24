package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactorymethid {
	
	WebDriver driver;
	
	@FindBy(xpath=("//input[@id='LoginForm_username']"))
	WebElement username1;
	
	@FindBy(xpath=("//input[@id='LoginForm_password']"))
	WebElement password1;
	
	
	public PageFactorymethid (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
