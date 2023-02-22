package Maven3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assert2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		  wd = new ChromeDriver();
		  wd.navigate().to("https://demoqa.com/");
		  wd.manage().window().maximize();	
		  Thread.sleep(4000);
		  
		  Robot rc = new Robot();
		  rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(3000);
			
		  wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]")).click(); //Elements
		  Thread.sleep(2000);
		  
			 wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[1]")).click();
			 wd.findElement(By.xpath("//*[@ id=\'userName\']")).sendKeys("Meghna");
			 wd.findElement(By.xpath("//*[@ id=\'userEmail\']")).sendKeys("meghna@gmail.com");
			 wd.findElement(By.xpath("//*[@ id=\'currentAddress\']")).sendKeys("Rajajinagar, Bengaluru");
			 wd.findElement(By.xpath("//*[@ id=\'permanentAddress\']")).sendKeys("Bengaluru");
			 Thread.sleep(2000);
			 wd.findElement(By.xpath("//*[@ id=\'submit\']")).click();
			 rc.keyPress(KeyEvent.VK_PAGE_DOWN);
			 
			 
	}

}
