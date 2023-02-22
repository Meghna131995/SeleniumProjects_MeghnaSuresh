package Maven3;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import javax.swing.event.MenuKeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.input.model.DragData;
import org.openqa.selenium.interactions.Actions;

public class tools_qa {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://demoqa.com/");
		wd.manage().window().maximize();
		Thread.sleep(5000);
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(5000);
	wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]")).click();
	Thread.sleep(5000);
		//Actions act=new Actions(wd);
		 //act.click(ab).build().perform();
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(5000);
		 wd.findElement(By.xpath("(//*[@class=\'header-right\'])[5]")).click();
		 Thread.sleep(5000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 wd.findElement(By.xpath("(//*[@class=\'btn btn-light \'])[28]")).click();////*[@id="simpleDropContainer"]
		 Thread.sleep(5000);
	//	WebElement fr= wd.findElement(By.id("(//*[@id=\'simpleDropContainer\'])"));
		//wd.switchTo().frame(fr);
		WebElement we = wd.findElement(By.id("draggable"));
		WebElement xz = wd.findElement(By.id("droppable"));
		Actions ac=new Actions(wd);
		ac.dragAndDrop(we,xz).build().perform();
	   // ac.dragAndDropBy(we, 138, 28).build().perform();
		 Thread.sleep(5000);
		 //wd.close();
			//wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click()	
		
	}
				
		
}
		
		
		
		
		
		
		
		
		


