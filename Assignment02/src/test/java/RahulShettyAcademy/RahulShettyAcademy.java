package RahulShettyAcademy;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class RahulShettyAcademy {
	WebDriver wd;
	public String s ="https://rahulshettyacademy.com/AutomationPractice";
 
	  @BeforeClass
  public void beforeClass() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(1000);		  
  }
  
  @Test (enabled=false)
  public void radio() throws InterruptedException {
	  wd.get(s);
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='left-align']/fieldset/label[1]/input[1]")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='left-align']/fieldset/label[2]/input[1]")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//*[@class='left-align']/fieldset/label[3]/input[1]")).click();
	  Thread.sleep(1000);
	 
	 
	 //suggestions
	 WebElement ab=wd.findElement(By.id("autocomplete"));
	 Thread.sleep(1000);
	 ab.sendKeys("India");
	 Thread.sleep(1000);
	 ab.sendKeys(Keys.ARROW_DOWN);
	 ab.sendKeys(Keys.ARROW_DOWN);
	 Thread.sleep(1000);
	 ab.sendKeys(Keys.ENTER);
	
	 WebElement cd=wd.findElement(By.id("dropdown-class-example"));
	 Thread.sleep(1000);
	 Select sc=new Select(cd);
	 sc.selectByIndex(0);
	 Thread.sleep(1000);
	 sc.selectByIndex(1);
	 Thread.sleep(1000);
	 sc.selectByIndex(2);
	
	 //for checkbox
	 wd.findElement(By.id("checkBoxOption1")).click();
	 Thread.sleep(1000);
	 wd.findElement(By.id("checkBoxOption2")).click();
	 Thread.sleep(1000);
	 wd.findElement(By.id("checkBoxOption3")).click();
  }
  
  @Test(enabled=false)
  public void window() throws InterruptedException {
	  wd.get(s);
	  Thread.sleep(1000);
	  String parentWindow =wd.getWindowHandle();
	  System.out.println(parentWindow);
	  wd.findElement(By.xpath("//button[@id='openwindow']")).click();
	  Thread.sleep(3000);
	  wd.switchTo().window(parentWindow);
  }
  
  @Test(enabled=true)
  public void tab() throws InterruptedException, AWTException {
	  wd.get(s);
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//a[@id='opentab']")).click();
	  Thread.sleep(3000);
	  Robot rc=new Robot();
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  rc.keyPress(MenuKeyEvent.VK_TAB);
	  rc.keyRelease(MenuKeyEvent.VK_CONTROL);
	  Thread.sleep(3000);
  }

  
}
