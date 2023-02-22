package Assignment_DemoQA;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class DemoQA {
	WebDriver wd;
	public String URL1="https://demoqa.com/";
	public String URL2="https://demoqa.com/links";
	public String URL3="https://demoqa.com/broken";
	public String URL4="https://demoqa.com/text-box";
	public String URL5="https://demoqa.com/checkbox";
	public String URL6="https://demoqa.com/radio-button";
	public String URL7="https://demoqa.com/webtables";
	public String URL8="https://demoqa.com/buttons";
	public String URL9="https://demoqa.com/upload-download";
	public String URL10="https://demoqa.com/dynamic-properties";
	public String URL11="https://demoqa.com/automation-practice-form";
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  wd = new ChromeDriver();
		  wd.manage().window().maximize();
		  Thread.sleep(3000);
	  }

	@Test (enabled = false)
	  public void TextBox() throws InterruptedException {
		wd.get(URL4);
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[1]")).click();
			 wd.findElement(By.xpath("//*[@ id=\'userName\']")).sendKeys("Meghna");
			 wd.findElement(By.xpath("//*[@ id=\'userEmail\']")).sendKeys("meghna@gmail.com");
			 wd.findElement(By.xpath("//*[@ id=\'currentAddress\']")).sendKeys("Rajajinagar, Bengaluru");
			 wd.findElement(By.xpath("//*[@ id=\'permanentAddress\']")).sendKeys("Bengaluru");
			 Thread.sleep(2000);
			 wd.findElement(By.xpath("//*[@ id=\'submit\']")).click();
			 Thread.sleep(2000);
			 JavascriptExecutor js = (JavascriptExecutor) wd;
		      js.executeScript("window.scrollTo(0, 600)");
		
	}
	@Test (enabled = false)
	  public void CheckBox() throws InterruptedException {
		wd.get(URL5);
		wd.findElement(By.xpath("//*[@class='rct-icon rct-icon-parent-close']")).click();
		Thread.sleep(2000);
		
	}
	@Test (enabled = false)
	  public void RadioButton() throws InterruptedException {
		wd.get(URL6);
		Thread.sleep(2000);
		wd.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
		Thread.sleep(2000);
		
	}
	
	@Test (enabled = false)
	  public void Webtables() throws InterruptedException, AWTException {
		wd.get(URL7);
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		  Thread.sleep(1000);
		  wd.findElement(By.id("firstName")).sendKeys("Meghna");
		  wd.findElement(By.id("lastName")).sendKeys("S");
		  wd.findElement(By.id("userEmail")).sendKeys("meghna@gmail.com");
		  wd.findElement(By.id("age")).sendKeys("25");
		  wd.findElement(By.id("salary")).sendKeys("25000");
		  wd.findElement(By.id("department")).sendKeys("Testing");
		  Thread.sleep(1000);
		  
		  //wd.findElement(By.xpath("//button[@id='submit']")).click();
	      Robot rc = new Robot();
	      rc.keyPress(KeyEvent.VK_ENTER);
	      
	      JavascriptExecutor js = (JavascriptExecutor) wd;
	      js.executeScript("window.scrollTo(0, 300)");
	      Thread.sleep(3000);
	      
	      wd.findElement(By.id("delete-record-1")).click(); //delete
	}
	
	@Test (enabled = false)
	  public void Buttons() throws InterruptedException {
		wd.get(URL8);
		  Thread.sleep(3000);
		  //Double click 
		  Actions act = new Actions(wd);
		  WebElement a = wd.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		  act.doubleClick(a).perform();
		  Thread.sleep(3000);
		  
		  JavascriptExecutor js = (JavascriptExecutor) wd;
	      js.executeScript("window.scrollTo(0, 300)");
	      
	      //right click 
		  WebElement b = wd.findElement(By.xpath("//button[@id='rightClickBtn']"));
		  Thread.sleep(3000);
		  act.moveToElement(b);
		  act.contextClick(b).build().perform();
		  Thread.sleep(3000);
		  
		  //Dynamic Click - not working 
		  //WebElement c = wd.findElement(By.xpath("//button[@id='kUMCY']"));
		  //act.moveToElement(c);
		  //act.click(c).build().perform();
		  //Thread.sleep(3000);
		  
		  
	}
	
  @Test (enabled = false)
  public void links() throws InterruptedException {
	  wd.get(URL2);
	  Thread.sleep(3000);
	  String parentWindow =wd.getWindowHandle();
	  System.out.println(parentWindow);
	  wd.findElement(By.id("simpleLink")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("dynamicLink")).click();
	  Thread.sleep(3000);
	  wd.navigate().refresh();
	  Thread.sleep(3000);
	  
	  wd.switchTo().window(parentWindow);
	  Thread.sleep(3000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) wd;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  wd.findElement(By.id("created")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("no-content")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("moved")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("bad-request")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("unauthorized")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("forbidden")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("invalid-url")).click();
	  Thread.sleep(3000);
	  
  }
  @Test (enabled = false)
  public void broken() throws InterruptedException {
	  wd.get(URL3);
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor) wd;
      js.executeScript("window.scrollTo(0, 400)");
      Thread.sleep(3000);
	  wd.findElement(By.xpath("//a[contains(text(),'Click Here for Broken Link')]")).click();
	  Thread.sleep(3000);
	  wd.navigate().back();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//a[contains(text(),'Click Here for Valid Link')]")).click();
  }
  @Test (enabled = false)
  public void Upload_file() throws InterruptedException {
	  wd.get(URL9);
	  wd.findElement(By.xpath("//a[@id='downloadButton']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\91984\\OneDrive\\Desktop\\Image_created_with_a_mobile_phone.png.webp"); 
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollTo(0, 300)");
      Thread.sleep(3000);
  }
  
  @Test (enabled = false)
  public void DynaminProperties() throws InterruptedException {
	  wd.get(URL10);
	  Thread.sleep(6000);
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollTo(0, 200)");
      Thread.sleep(3000);
  }
  
  
  @Test (enabled = false)
  public void PracticeForm() throws InterruptedException, AWTException {
	  wd.get(URL11);
	  Thread.sleep(3000);
	  //Name
	  wd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Meghna");
	  wd.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Suresh");
	  Thread.sleep(2000);
	  
	  //Email
	  wd.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("meghna@gmail.com");
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollTo(0, 200)");
      Thread.sleep(3000);
      
      //Gender
	  wd.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	  
	  //Phone Number
	  wd.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9909900990");
	  
	  //DOB
	  wd.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	  Thread.sleep(1000);
	  //Month
	  WebElement month_dropdown = wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
	  Select month=new Select(month_dropdown);
	  month.selectByVisibleText("February");
	  Thread.sleep(2000);
	  //year
	  WebElement year_dropdown = wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
	  Select year=new Select(year_dropdown);
	  year.selectByVisibleText("1995");
	  Thread.sleep(2000);
	  //Date
	  wd.findElement(By.xpath("//div[contains(text(),'13')]")).click();
	  
	  //auto complete
	  js.executeScript("window.scrollTo(0, 500)");
	    Thread.sleep(2000);
	  WebElement products=wd.findElement(By.id("subjectsInput"));
	    products.sendKeys("English");
	    products.sendKeys(Keys.ARROW_DOWN);
	    products.sendKeys(Keys.ENTER);
	    products.sendKeys("Maths");
	    products.sendKeys(Keys.ARROW_DOWN);
	    products.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	  
	    //Hobbies
	    
	    wd.findElement(By.xpath("//label[contains(text(),'Music')]")).click(); 
	  
	    //upload picture
	    
	    Thread.sleep(3000);
	    wd.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\91984\\OneDrive\\Desktop\\Meghna Documents\\Syntax for data type.png");
	    Thread.sleep(1000);
	    
	    //Address
	    wd.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Rajajinagar, Bengaluru, karnataka");
	    Thread.sleep(3000);
	    
	  //submit - dummy
	    WebElement submit=wd.findElement(By.id("subjectsInput"));
	    submit.sendKeys("Rajasthan");
	    submit.sendKeys(Keys.ARROW_DOWN);
	    submit.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    
  }
  @Test (enabled = false)
  public void AutoComplete() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/auto-complete");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor) wd;
	  js.executeScript("window.scrollTo(0, 200)");
      Thread.sleep(3000);
	  Actions act = new Actions(wd);
	  Robot rb = new Robot();
	  
	  WebElement we= wd.findElement(By.xpath("//div[@id='selectMenuContainer']//div[@class='row']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']"));
	  
	  act.click(we).perform();
	  act.sendKeys("Green").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("Black").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("Blue").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  act.sendKeys("Red").perform();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_ESCAPE);
  }
  
  @Test (enabled = false)
  public void BrowserWindows() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/browser-windows");
	  wd.manage().window().maximize();
	  Thread.sleep(2000);
	  String parentWindow =wd.getWindowHandle();
	  System.out.println(parentWindow);
	  
	  Robot rc = new Robot();
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  wd.findElement(By.id("tabButton")).click();
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  rc.keyPress(MenuKeyEvent.VK_TAB);
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  
	  Thread.sleep(3000);
	  
	  rc.keyPress(MenuKeyEvent.VK_DOWN); 
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  for(int i=0; i<3; i++){
		  wd.findElement(By.id("windowButton")).click();
		  Thread.sleep(1000);
      }
	  Set<String> allwindows = wd.getWindowHandles();
	  System.out.println(allwindows);
	  System.out.println(allwindows.size());
	  
	  String lastWindow="";
	  for(String handle: allwindows) {
		  wd.switchTo().window(handle);
		  wd.get("https://www.google.com/");
		  lastWindow = handle; 
	  }
	  Thread.sleep(3000);
	  wd.switchTo().window(parentWindow);
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.close();
	  wd.switchTo().window(lastWindow);
	  wd.get("https://www.gmail.com/");
	  
	  
	  //Thread.sleep(2000);
	  //rc.keyPress(MenuKeyEvent.VK_DOWN);
	  //rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  //wd.findElement(By.id("messageWindowButton")).click();
	  
	  //Thread.sleep(4000);
	  //wb.quit();  
	  
  }
	  
  @Test (enabled = false)
  public void Alters() throws InterruptedException, AWTException {
	  
	  wd.get("https://demoqa.com/alerts");
	  Thread.sleep(6000);
	  Robot rc = new Robot();
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  wd.findElement(By.id("alertButton")).click();
	  Alert alt=wd.switchTo().alert();
	  System.out.print(alt.getText());
	  Thread.sleep(2000);
	  alt.accept();
	  
	  Thread.sleep(2000);
	  
	  
	 
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  
	  wd.findElement(By.id("timerAlertButton")).click();
	  //wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wbw = new WebDriverWait(wd, Duration.ofSeconds(180));
	  wbw.until(ExpectedConditions.alertIsPresent());
	  alt.accept();
	  
	  Thread.sleep(2000);
	  
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  wd.findElement(By.id("confirmButton")).click();;
	  Thread.sleep(3000);
	  alt.dismiss();
	  
	  Thread.sleep(2000);
	  
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  Thread.sleep(2000);
	  wd.findElement(By.id("promtButton")).click();
      Thread.sleep(2000);
      Alert alter3=wd.switchTo().alert();
      System.out.println(alter3.getText());
      Thread.sleep(2000);
      alter3.sendKeys("abcd");
      alter3.accept();
  }
  
  @Test (enabled = false)
  public void Frames() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/frames");
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
  
  @Test (enabled = false)
  public void Accordian() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/accordian");
	  Thread.sleep(2000);
	  wd.findElement(By.id("section1Heading")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.id("section2Heading")).click();
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(2000);
	  wd.findElement(By.id("section3Heading")).click();
  }
  @Test (enabled = false)
  public void Slider() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/slider");
	  Thread.sleep(2000);
	  WebElement element = wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
	  Actions act = new Actions(wd);
	  act.dragAndDropBy(element, 70, 100).perform();
  }
  
  @Test (enabled = false)
  public void Hover() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/tool-tips");
	  Thread.sleep(2000);
	  Actions action = new Actions(wd);
	  WebElement we = wd.findElement(By.xpath("//button[@id='toolTipButton']"));
	  Thread.sleep(1000);
	  action.moveToElement(we).build().perform();
  }
  @Test (enabled = false)
  public void Drop_Drag() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/droppable");
	  Thread.sleep(2000);
	  Actions builder = new Actions(wd);
	  WebElement from = wd.findElement(By.id("draggable")); 
	  WebElement to = wd.findElement(By.id("droppable"));	 
		JavascriptExecutor js = (JavascriptExecutor)wd;
		  js.executeScript("window.scrollBy(0,200)");
		  Thread.sleep(2000);
		
		builder.dragAndDrop(from, to).perform();
		

	}	

  @Test (enabled = false)
  public void Login() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/login");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,200)");
	  //Register
	  /*Thread.sleep(1000);
	  wd.findElement(By.xpath("//button[@id='newUser']")).click();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,400)");
	  Thread.sleep(1000);
	 
	  wd.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Megha");
	  wd.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sur");
	  wd.findElement(By.xpath("//input[@id='userName']")).sendKeys("Megh12006000");
	  wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Avengers@123");
	  wd.findElement(By.xpath("//div[@id='g-recaptcha']")).click();
	  Thread.sleep(1000);
	  wd.findElement(By.xpath("//button[@id='register']")).click();
	  Thread.sleep(1000);
	  Alert alt=wd.switchTo().alert();
	  Thread.sleep(2000);
	  alt.accept();
	  wd.findElement(By.xpath("//button[@id='gotologin']")).click(); */
	  
	  //Login
	  wd.findElement(By.xpath("//input[@id='userName']")).sendKeys("Megh12");
	  wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Avengers@123");
	  wd.findElement(By.xpath("//button[@id='login']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//button[contains(text(),'Log out')]")).click();
  }
  
  @Test (enabled = false)
  public void Sortable() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/sortable");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,200)");
	  Thread.sleep(2000);
	  Actions action=new Actions(wd);
	  List<WebElement> elements=wd.findElements(By.xpath("//*[@id=\'demo-tabpane-list\']/div/div"));
	  for(int i =0;i<elements.size();i++) {
	  action.dragAndDrop(elements.get(0), elements.get(i)).build().perform();
	  }
  }
  
  @Test (enabled = false) 
  public void resizable() throws InterruptedException, AWTException {
	  wd.get("https://demoqa.com/resizable");
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  Actions act = new Actions(wd);
	  WebElement we = wd.findElement(By.xpath("//*[@class='react-resizable-handle react-resizable-handle-se'][1]"));
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,250)");
	  Thread.sleep(3000);
	  act.clickAndHold(we).build().perform();
	  act.moveByOffset(150, 0).build().perform();
	  act.release().build().perform();
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,250)");
	  WebElement we1 =	wd.findElement(By.xpath("//*[@id='resizable']/span"));
	  Thread.sleep(2000);
	  act.clickAndHold(we1).build().perform();
	  act.moveByOffset(150, 100).build().perform();
	  act.release().build().perform();
	  
  }
  

}
