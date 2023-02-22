package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize(); 
		Thread.sleep(2000);
		File scr = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr, new File("C:/Users/Default/Pictures/scr1.png"));
		

	}
}
