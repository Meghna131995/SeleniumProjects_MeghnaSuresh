package Maven3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class assert1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize(); //Maximise wondow
		
		//String string = wd.getTitle();
		//System.out.println(string);
		//String expected = "Organehrm";
		//Assert.assertEquals(string,expected);
		
		WebElement a = wd.findElement(By.xpath("//*[@class=\'oxd-text oxd-text--p orangehrm-login-forgot-header\']"));
		Assert.assertEquals(true, a.isDisplayed());
		System.out.println("Assertion Passed");
		wd.quit();
		
}
	
}