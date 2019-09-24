package TestNGPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestConnect {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchbrowser()
	{
		//WebDriver driver=null;
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
	}
	
	@Test()
	@Parameters({"susername","spassword"})
	
	public void LoginTesting() throws InterruptedException
	{
		//WebDriver driver =new FirefoxDriver();
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='LoginForm_username']"));
		ele.sendKeys("juneeth");
		WebElement ele1=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		ele1.sendKeys("spassword");
		 //Thread.sleep(1000);
		 WebElement ele3 =driver.findElement(By.xpath("//input[@value='Login']"));
		//Thread.sleep(3000);
		//ele3.click();
	}
	
   /*  @Test(priority = 0)
	public void passwordTesting() throws InterruptedException
	{
    	 //Thread.sleep(7000);
		//WebDriver driver =new FirefoxDriver();
    	driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys("junaid123@");
	}   */
	
	
	@AfterTest
	public void close()
	{
		//WebDriver driver =new FirefoxDriver();
		//driver.close();
	}


}
