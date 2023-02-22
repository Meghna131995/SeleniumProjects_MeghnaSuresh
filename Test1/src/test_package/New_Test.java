package test_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class New_Test {
	WebDriver wd;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
	  wd = new ChromeDriver();
	  wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.manage().window().maximize();
  }
  
  @Test (priority = 0)
  public void login() throws InterruptedException {
	  	Thread.sleep(3000);
		wd.findElement(By.name("username")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(1000);
  }
  @Test (priority = 1)
  public void about_us() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-tab\']")).click();
	  wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-link\'][1]")).click();
	  Thread.sleep(10000);
	  
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("Logged in and closed the window");
	  wd.close();
  }

}
