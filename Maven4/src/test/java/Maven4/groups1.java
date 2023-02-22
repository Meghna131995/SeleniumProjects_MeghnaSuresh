package Maven4;

import org.testng.annotations.Test;

public class groups1 {
	
  @Test (groups = "smoke", priority = 0)
  public void testCase1() {
	  System.out.println("first smoke test");
  }
  
  @Test (groups = "regression", priority = 1)
  public void testCase2() {
	  System.out.println("first regression test");
  }
  
  @Test (groups = "smoke", priority = 3)
  public void testCase3() {
	  System.out.println("second smoke test");
  }
  
  @Test (groups = "regression", priority = 4)
  public void testCase4() {
	  System.out.println("second regression test");
  }
  
  
}
