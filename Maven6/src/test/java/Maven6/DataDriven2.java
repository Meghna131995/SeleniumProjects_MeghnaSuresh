package Maven6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataDriven2 {
	
	WebDriver wd;
	public String URL="https://opensource-demo.orangehrmlive.com/";
	 public int i,j;
	 public String username, username1, password, password1;

	  @BeforeTest
	   public void beforeTest() throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  wd = new ChromeDriver();
		  wd.get(URL);
		  wd.manage().window().maximize();
		  Thread.sleep(3000);
	  
	  }
  
  
  @Test
  public void Test() throws InterruptedException, IOException {
	  File dd = new File("C:\\Users\\91984\\OneDrive\\Desktop\\Meghna Documents\\dataDriven2.xlsx");
      FileInputStream fis = new FileInputStream(dd);        
      XSSFWorkbook book = new XSSFWorkbook(fis);
      XSSFSheet sheet = book.getSheet("Sheet1");
      
      int row_count = sheet.getLastRowNum(); //fetches till the last row
      for (i=0; i<=row_count; i++) {
          username = sheet.getRow(i).getCell(0).getStringCellValue();
          password = sheet.getRow(i).getCell(1).getStringCellValue();
          wd.findElement(By.name("username")).sendKeys(username);
           wd.findElement(By.name("password")).sendKeys(password);
           Thread.sleep(2000);
           wd.findElement(By.xpath("//*[@type='submit']")).click();
           Thread.sleep(3000);
           if (wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
               Thread.sleep(2000);
               wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-tab\']")).click();
               Thread.sleep(3000);
               wd.findElement(By.linkText("Logout")).click();
               Thread.sleep(3000);
           }
           else if (wd.findElement(By.xpath("//*[@class='oxd-alert-content oxd-alert-content--error']")).isDisplayed()) {
              //System.out.println("Invalid Credentials");
               for (j=i+1; j<=row_count; j++) {
                   username1 = sheet.getRow(j).getCell(0).getStringCellValue();
                   password1 = sheet.getRow(j).getCell(1).getStringCellValue();
                   wd.findElement(By.name("username")).sendKeys(username1);
                   wd.findElement(By.name("password")).sendKeys(password1);
                   Thread.sleep(2000);
                   wd.findElement(By.xpath("//*[@type='submit']")).click();
                   Thread.sleep(3000);
               if (wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
                   Thread.sleep(2000);
                   wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-tab\']")).click();
                   Thread.sleep(3000);
                   wd.findElement(By.linkText("Logout")).click();
                   Thread.sleep(3000);     
               }
               }
               break;
                  }
      }
           
	  
  }

  @AfterTest
  public void afterTest() {
	  wd.quit();
  }

}
