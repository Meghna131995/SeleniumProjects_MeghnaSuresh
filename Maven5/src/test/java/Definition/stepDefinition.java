package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	WebDriver wd;
	
	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  wd = new ChromeDriver();
		  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(3000);
		  wd.manage().window().maximize();
		  Thread.sleep(3000);
		
	    
	}
	@When("Enter the valid username {string}")
	public void enter_the_valid_username(String string) throws InterruptedException {
		wd.findElement(By.name("username")).sendKeys(string);
		 Thread.sleep(3000);
	    
	}
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String string) throws InterruptedException {
		wd.findElement(By.name("password")).sendKeys(string);
		Thread.sleep(3000);
	    
	}
	@When("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
	}
	@Then("I should get the title {string}")
	public void i_should_get_the_title(String string) throws InterruptedException {
		Assert.assertEquals(wd.getTitle(), string);
		Thread.sleep(3000);
	}

}
