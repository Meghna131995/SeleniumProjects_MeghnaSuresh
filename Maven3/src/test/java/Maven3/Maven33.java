package Maven3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Maven33 {
	WebDriver wd; 
	
	@BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		  wd = new ChromeDriver();
		  wd.navigate().to("https://rahulshettyacademy.com/practice-project");
		  wd.manage().window().maximize();		 
	  }
	
	
	@Test
  public void f() throws InterruptedException, AWTException {
		WebElement web = wd.findElement(By.linkText("More"));
		  
		  Actions act = new Actions(wd);
		  Thread.sleep(3000);
		  act.moveToElement(web).build().perform();
		  
		  Robot rc = new Robot();
		  rc.keyPress(MenuKeyEvent.VK_DOWN);
		  rc.keyPress(MenuKeyEvent.VK_DOWN);
		  Thread.sleep(3000);
		  rc.keyPress(MenuKeyEvent.VK_UP);
		  Thread.sleep(3000);
		  
		  //wd.findElement(By.linkText("Home")).click();
		  //wd.findElement(By.xpath("//*[@class='nav-outer clearfix']/nav/div[2]/ul/li[1]")).click(); 
		  //wd.findElement(By.xpath("//*[@class='fa fa-linkedin\']")).click(); 
		  wd.findElement(By.xpath("//*[@class='nav-outer clearfix']/nav/div[2]/ul/li[2]")).click();
		  Thread.sleep(3000);
		  
  }
  

  @AfterTest
  public void afterTest() {
  wd.close();
  }

}
