package Selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class outlook_test {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.co.in");
		/*WebElement input=driver.findElement(By.name("q"));
		input.sendKeys("selenium");
		input.submit();
		WebElement click_link=driver.findElement(By.partialLinkText("Selenium - Web Browser"));
		 click_link.click();
		 WebElement click_download=driver.findElement(By.partialLinkText("Download"));
		 click_download.click();
         WebElement click_latest=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/table[2]/tbody/tr[2]/td[2]/a"));
         click_latest.click();
         driver.findElement(By.xpath("//*[@id=\"sites-canvas-main-content\"]/table/tbody/tr/td/div/div[1]/ul/li[1]/a")).click();
         
        String oldwindow= driver.getWindowHandle();

        System.out.println("lod window name :"+oldwindow);
         Set<String> allwin= driver.getWindowHandles();
         int abc =allwin.size();
         System.out.println(abc);
         for (String string : allwin) {
       			driver.switchTo().window(string);
         }
         WebElement file=driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]/a"));
	        file.click();
	        Thread.sleep(5000);
	        
	        File filelocation=new File("C:\\Users\\training\\Downloads");
	        File[] totalfile=filelocation.listFiles();
	        for (File download : totalfile) {
	        	if(download.getName().equalsIgnoreCase("chromedriver_win32.zip"));
	        	{
	        		System.out.println("file downloaded");
	        		break;
	        	}		
			}
	        driver.close();
       			driver.switchTo().window(oldwindow);
       			Thread.sleep(3000);
    	        driver.findElement(By.xpath("//*[@id=\"jot-ui-searchInput\"]")).sendKeys("vishva");
  
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().back();*/
	        
	       
	        WebElement input1=driver.findElement(By.name("q"));
			input1.sendKeys("outlook");
			input1.submit();
			driver.findElement(By.partialLinkText("My Account")).click();
			Thread.sleep(3000);
			driver.switchTo().frame("h_signiniframe");
			Thread.sleep(3000);
			WebElement id=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div/input"));
			id.sendKeys("visvanaths@maveric-systems.com");
			driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/input")).click();
	        //id.submit();
			 Thread.sleep(6000);
	        WebElement pass=driver.findElement(By.xpath("//*[@id=\'i0118\']"));
	        Thread.sleep(3000);
			pass.sendKeys("vishva15398@gmail.com");
	         pass.submit();
	         Thread.sleep(3000);
	        driver.findElement(By.id("KmsiCheckboxField")).click();
	        driver.findElement(By.id("idBtn_Back")).click();
	        driver.switchTo().defaultContent();
	        Thread.sleep(2000);
	        driver.findElement(By.id("O365_MainLink_NavMenu")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"O365_AppTile_Mail\"]/div/span[2]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[1]/div[2]/button/div")).click();
	        Thread.sleep(2000);
             //driver.switchTo().frame(1);
	        List<WebElement> frame=driver.findElements(By.tagName("iframe"));
	        System.out.println("total frame :"+frame.size());
	        System.out.println("total frame :"+frame.getClass());
	        
	        
	        
	        WebElement inputbox=   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/div/div/input"));  
	       inputbox.sendKeys("visvanaths@maveric-systems.com");
	       	Thread.sleep(2000);
	       	inputbox.sendKeys(Keys.TAB);
	       	inputbox.sendKeys("rojat@maveric-systems.com");
	       	Thread.sleep(2000);
	       	//inputbox.submit();
	       Thread.sleep(2000);
	       driver.findElement(By.id("subjectLine0")).sendKeys("files");
	       WebElement sizes=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[4]/div[2]/div[2]/div/div/div/div/div"));
	       sizes.click();
	       //Actions action=new Actions(driver);
	     driver.findElement(By.name("Browse this computer")).click();
	       //driver.findElement(By.xpath("/html/body/div[9]")).click();
	     //List<WebElement> lists=driver.findElements(By.className("ms-Button-flexContainer flexContainer-52"));
	      /* 
	       
	       
	       */
	     Thread.sleep(2000);
       String File="C:\\Users\\training\\Downloads\\chromedriver_win32.zip";
	     StringSelection selection=new StringSelection(File);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	     Robot robot=new Robot();
	     Thread.sleep(2000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
         //robot.keyPress(KeyEvent.VK_V);
	     robot.keyPress(KeyEvent.VK_V);
	    // robot.keyPress(KeyEvent.VK_CONTROL);
	     //robot.keyPress(KeyEvent.VK_ENTER);	 
	     robot.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(30000);
	      
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[4]/div[2]/div[1]/button[1]/div")).click();
	       System.out.println("aaaaaa");
	}

}
