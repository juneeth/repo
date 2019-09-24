package Selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("lenovo ideapad 8 gb Ram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		//String TextValue=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).getAttribute("value");
		//System.out.println(TextValue);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),' Deals')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='101_dealView_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='nav-a'][contains(text(),'Amazon Pay')]")).click();
		Alert click = driver.switchTo().alert();
		click.accept();
		
		
		//String actualUrl="https://www.amazon.in/s?k=lenovo+ideapad+8+gb+Ram&ref=nb_sb_noss_2";
		 /*[@id="acrCustomerReviewText"]
				 if (actualUrl.equals(currenturl))
				 {
					 System.out.println("Actual and current url is same ");
					 
				 }
				 else {
					 System.out.println("Actual and current url is not same");
				 }
		  String title= driver.getTitle();
		  System.out.println("The Title of the page:"+ " "+title);
		  WebElement web =driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));*/
		 /* driver.navigate().to("https://www.flipkart.com/");
		  Thread.sleep(5000);
		  driver.navigate().back();
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  Thread.sleep(2000);
		  driver.close();*/
	}

}
