package Maven3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class december13 {
	WebDriver wd;
	
  @Test(dataProvider = "dp")
  public void data_provider(String n, String s) throws InterruptedException {
	  Thread.sleep(2000);
	  
	  wd.findElement(By.name("username")).sendKeys(n);
	  wd.findElement(By.name("password")).sendKeys(s);
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();	
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("Logout")).click();;
	  Thread.sleep(3000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin234" },
      new Object[] { "Meghna", "admin234" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
