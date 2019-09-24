package Selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Tables {

	
	public static void main(String[] args) throws IOException {
       ////*[@id="content"]/table/tbody/tr[1]/th
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
	   
	    //driver.findElement(By.xpath("//th[contains(text(),'Burj Khalifa')]")).getText();
		String Text="Clock Tower Hotel";
		System.out.println(Text);
		///html/body/div[1]/div[5]/div[2]/div/div/table/tbody/tr[1]/th
		 String Textofsiblings=driver.findElement(By.xpath("//th[contains(text(),'"+Text+"')]//following-sibling::td[2]")).getText();
		System.out.println(Textofsiblings);
		TakesScreenshot shot = ((TakesScreenshot)driver);
	    for(int i=1;i<=3;i++)
	    {
		File  srcFile = shot.getScreenshotAs(OutputType.FILE);
		File desFile =new File("C:\\screen\\jun"+i+".png");
		Files.copy(srcFile, desFile);
	    }
		

	}

}
