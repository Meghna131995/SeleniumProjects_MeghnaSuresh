package Maven3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class elements2 {
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
	  
	  
	  rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(3000);
	  
	  //directory 'Home' clicking
	  //wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();
	  //wd.findElement(By.xpath("//*[@class='rct-icon rct-icon-parent-close']")).click();
	  
	  //Radio Button clicking - not working
	  //wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[3]")).click();
	  //Thread.sleep(3000);
	  //wd.findElement(By.xpath("//*[@class='custom-control custom-radio custom-control-inline'][1]")).click();
	  
	  
	  //Add new web tables
	  /*wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
	  wd.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.id("firstName")).sendKeys("Meghna");
	  wd.findElement(By.id("lastName")).sendKeys("S");
	  wd.findElement(By.id("userEmail")).sendKeys("meghna@gmail.com");
	  wd.findElement(By.id("age")).sendKeys("25");
	  wd.findElement(By.id("salary")).sendKeys("25000");
	  wd.findElement(By.id("department")).sendKeys("Testing");
	  Thread.sleep(1000);
	  
	  rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(3000);
	  
	  WebElement web = wd.findElement(By.xpath("//*[@class='text-right col-md-2 col-sm-12']"));
	  Actions act = new Actions(wd);
	  Thread.sleep(3000);
	  act.moveToElement(web).build().perform();
	  
	  Robot rd = new Robot();
	  rd.keyPress(KeyEvent.VK_ENTER);*/
	  
	  //Delete a web table entry
	  /*wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();
	  wd.findElement(By.id("delete-record-1")).click();
	  
	  Thread.sleep(3000);*/
	  
	  //Double click 
	  //wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[5]")).click();
	  //WebElement a = wd.findElement(By.xpath("//*[@class='btn btn-primary'][1]"));
	  //Actions act = new Actions(wd);
	  //act.doubleClick(a).perform();
	  //rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //Thread.sleep(3000);
	  
	  //right click 
	  /*WebElement b = wd.findElement(By.xpath("//*[contains(text(),'Right Click Me')]"));
	  Thread.sleep(3000);
	  Actions act1 = new Actions(wd);
	  act1.moveToElement(b);
	  act1.contextClick(b).build().perform();*/
	  
	  //click - not working 
	  //WebElement c = wd.findElement(By.xpath("//*[@class='mt-4'][2]/button"));
	  //WebElement c = wd.findElement(By.xpath("//*[contains(text(),'Click Me')[3]]"));
	  //Actions act2 = new Actions(wd);
	  //act2.moveToElement(c);
	  //act2.click(c).build().perform();
	  
	  //act.click(c).build().perform();
	  
	  
	}
}
