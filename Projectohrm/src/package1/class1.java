package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class class1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize(); //Maximise wondow
		//wd.findElement(By.xpath("//*[@class=\'oxd-text oxd-text--p\']")).sendKeys("admin");
		//wd.findElement(By.linkText("Username")).sendKeys("admin");
		Thread.sleep(3000);
		wd.findElement(By.name("username")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-tab\']")).click();
		wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-link\'][1]")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class=\'oxd-dialog-close-button oxd-dialog-close-button-position\']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
	       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");//get the height of the webpage and scroll to the end
		
	}
}

