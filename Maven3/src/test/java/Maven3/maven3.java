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

public class maven3 {
	
	WebDriver dr;
	public String url1="https://www.google.com/";
	public String url2="https://www.amazon.in/";
	
	@BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(url1);  
		dr.manage().window().maximize();
	  }

	
	@Test
	public void actions() throws InterruptedException, AWTException {
		WebElement link1 = dr.findElement(By.xpath("//*[contains(text(),'Gmail')]")); //text is a name, Gmail is the test we are finding.
		Thread.sleep(3000);
		Actions act = new Actions(dr);
		act.contextClick(link1).build().perform();
		
		Robot rc = new Robot();
		Thread.sleep(3000);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(3000);
		rc.keyPress(MenuKeyEvent.VK_CONTROL);
		rc.keyPress(MenuKeyEvent.VK_TAB);
		
		// WebElement link2 = dr.findElement(By.xpath("//*[contains(txt(),'Create an account')]")); 
		// Thread.sleep(3000);
		// Actions act2 = new Actions(dr);
		// act2.click(link2).build().perform();;
		
		
	}
	
	
  
  @AfterTest
  public void afterTest() {
	  //dr.close();
  }

}
