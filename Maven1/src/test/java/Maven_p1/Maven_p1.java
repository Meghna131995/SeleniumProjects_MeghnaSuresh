package Maven_p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_p1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize(); //Maximise wondow
		//wd.findElement(By.xpath("//*[@class=\'oxd-text oxd-text--p\']")).sendKeys("admin");
		//wd.findElement(By.linkText("Username")).sendKeys("admin");
		Thread.sleep(3000);
	}

}
