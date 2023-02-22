package Maven3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class dec13 {
	WebDriver wb;
	String url1="https://demoqa.com/upload-download";
	String url2="https://demoqa.com/alerts";
	String url3="https://demoqa.com/browser-windows";
	 @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
		  wb = new ChromeDriver();
	  }
	
  @Test (enabled = false)
  public void Upload_file() {
	  wb.get(url1);
	  wb.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\91984\\OneDrive\\Desktop\\Meghna Documents\\Meghna_PU.pdf"); 
	  
  }
  
  @Test (enabled = false)
  public void alerts() throws InterruptedException, AWTException {
	  wb.get(url2);
	  wb.manage().window().maximize();
	  
	  Robot rc = new Robot();
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  wb.findElement(By.id("alertButton")).click();
	  Alert alt=wb.switchTo().alert();
	  System.out.print(alt.getText());
	  Thread.sleep(2000);
	  alt.accept();
	  
	  Thread.sleep(2000);
	  
	  
	 
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  wb.findElement(By.id("timerAlertButton")).click();
	  //wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wbw = new WebDriverWait(wb, 180);
	  wbw.until(ExpectedConditions.alertIsPresent());
	  alt.accept();
	  
	  Thread.sleep(2000);
	  
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  wb.findElement(By.id("confirmButton")).click();;
	  Thread.sleep(3000);
	  alt.dismiss();
	  
	  Thread.sleep(2000);
	  
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  wb.findElement(By.id("promtButton")).click();
      Thread.sleep(2000);
      Alert alter3=wb.switchTo().alert();
      System.out.println(alter3.getText());
      Thread.sleep(2000);
      alter3.sendKeys("abcd");
      alter3.accept();
	  
	  
	  
	  
  }
  
  @Test (enabled = true)
  public void windows() throws InterruptedException, AWTException {
	  wb.get(url3);
	  wb.manage().window().maximize();
	  Thread.sleep(2000);
	  String parentWindow =wb.getWindowHandle();
	  System.out.println(parentWindow);
	  
	  Robot rc = new Robot();
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  wb.findElement(By.id("tabButton")).click();
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  rc.keyPress(MenuKeyEvent.VK_TAB);
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  
	  Thread.sleep(3000);
	  
	  rc.keyPress(MenuKeyEvent.VK_DOWN); 
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  for(int i=0; i<3; i++){
		  wb.findElement(By.id("windowButton")).click();
		  Thread.sleep(1000);
      }
	  Set<String> allwindows = wb.getWindowHandles();
	  System.out.println(allwindows);
	  System.out.println(allwindows.size());
	  
	  String lastWindow="";
	  for(String handle: allwindows) {
		  wb.switchTo().window(handle);
		  wb.get("https://www.google.com/");
		  lastWindow = handle; 
	  }
	  Thread.sleep(3000);
	  wb.switchTo().window(parentWindow);
	  wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wb.close();
	  wb.switchTo().window(lastWindow);
	  wb.get("https://www.gmail.com/");
	  
	  
	  //Thread.sleep(2000);
	  //rc.keyPress(MenuKeyEvent.VK_DOWN);
	  //rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  //wb.findElement(By.id("messageWindowButton")).click();
	  
	  //Thread.sleep(4000);
	  //wb.quit();  
	  
  }
  
 
  
	

  @AfterTest
  public void afterTest() {
  }

}
