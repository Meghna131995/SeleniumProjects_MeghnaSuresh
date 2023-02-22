package Maven4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class framesExample {
	WebDriver wd; 
	
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get("https://demoqa.com/frames");
	  Thread.sleep(3000);
	  wd.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  }	
  
  @Test
  public void frame() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(2000);
	  List<WebElement> frames = wd.findElements(By.tagName("iframe"));
	  System.out.println(frames);
	  System.out.println(frames.size());
	  
	  for(int i=0;i<8;i++) {
		  String str=frames.get(i).getAttribute("id");
		  System.out.println(str);
		  
	  }
	  
	  
	  wd.switchTo().frame("frame2");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(2000);
  }
  

  @AfterTest
  public void afterTest() {
  }

}
