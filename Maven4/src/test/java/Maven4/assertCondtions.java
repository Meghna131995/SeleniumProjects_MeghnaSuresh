package Maven4;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class assertCondtions {
	@Test(priority=0)
	  public void method1() {
		  AssertJUnit.assertEquals("tushar","tushar1");
		  System.out.println("this is the first case");
	  }
	  @Test(priority=1,dependsOnMethods = "method1",alwaysRun = true)
	  public void method2() {
		  System.out.println("this is the second case");
	  }
	  @Test(priority=2,dependsOnMethods = "method1",alwaysRun = false)
	  public void method3() {
		  System.out.println("this is the Third case");
	  }
	  @Test(priority=3)
	  public void method4() {
		  System.out.println("this is the Fourth case");
	  }
}
	
  
	/*@Test (priority = 0)
  public void test1() {
	  AssertJUnit.assertEquals("123", "123");
	  System.out.println("First condtion pass");
  }
  
  @Test (priority = 1, dependsOnGroups = "test1")
  public void test2() {
	  
	  System.out.println("Second condtion pass");
  }
  
  @Test (priority = 2, dependsOnGroups = "test1", alwaysRun = true)
  public void test3() {
	  
	  System.out.println("third condtion pass");
  }
  
  @Test (priority = 3, dependsOnGroups = "test1", alwaysRun = false)
  public void test4() {
	  
	  System.out.println("fourth condtion pass");*/
  


