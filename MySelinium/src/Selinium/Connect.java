package Selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Connect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://testleaf.herokuapp.com/");
		//List<WebElement> username = driver.findElements(By.tagName("input"));
	    
		//Thread.sleep(2000);
		//int text = username.size();
		//System.out.println("number of the element "+text);
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[6]/a")).click();
		//WebElement element = driver.findElement(By.name("news"));
		//element.click();
	/*	if(element.isDisplayed())
		{
			System.out.println("it is displayed");
		}
		else
		{
			System.out.println("it is not displayed");
		}
		if (element.isEnabled())
		{
			System.out.println("it is enabled");
		}
		else
		{
			System.out.println("it is not enabled");
		}
		if(element.isSelected())
		{
			System.out.println("The button is selected");
		}
		else
		{
			System.out.println("The button is not selected");
		} */
		driver.get("https://testleaf.herokuapp.com/");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[5]/a")).click();
	    Select dropdown = new Select(driver.findElement(By.id("dropdown1")));
	    dropdown.selectByVisibleText("Selenium");
	    Thread.sleep(2000);
	    Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@name='dropdown2']")));
	    dropdown1.selectByIndex(2);
	    Thread.sleep(2000);
	    Select dropdown2 = new Select(driver.findElement(By.id("dropdown3")));
	    dropdown2.selectByVisibleText("Loadrunner");
	   
	   
	}
}
