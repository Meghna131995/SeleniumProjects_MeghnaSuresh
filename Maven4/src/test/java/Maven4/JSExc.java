package Maven4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JSExc {
	WebDriver wb;
	
  @BeforeTest
   public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  wb = new ChromeDriver();
	  wb.get("https://demoqa.com/text-box");
	  Thread.sleep(3000);
	  wb.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @Test
  public void f() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)wb;
	  Thread.sleep(3000);
	  
	  js.executeScript("document.getElementById('userName').value= 'Meghna'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('userEmail').value= 'meghna@gmail.com'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('currentAddress').value= 'Bangalore'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('permanentAddress').value= 'Bangalore'");
	  Thread.sleep(3000);
	  js.executeScript("document.getElementById('submit').click()");
	  Thread.sleep(3000);
	  
	  js.executeScript("window.scrollBy(0,600)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-400)");
	  Thread.sleep(2000);
	//directory 'Home' clicking
	  wb.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();
	  Thread.sleep(2000);
	  wb.findElement(By.xpath("//*[@class='rct-icon rct-icon-parent-close']")).click();
	  Thread.sleep(2000);
	  
	  //js.executeScript("history.go(0)");
	  //js.executeScript("window.history.forward(0)");
  }
  
}
