package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 0)
  public void f() {
	  Reporter.log("F method",true);
  }
  @Test(priority = 2)
  public void c()
  {
	  Reporter.log("c method",true);
  }
  @Test(priority = 3)
  public void b()
  {
	  Reporter.log("B method",true);
  }
  @Test
  public void a()
  {
	  Reporter.log("A method ",true);
  }
  @Test(priority = 1)
  public void g()
  {
	  Reporter.log("G method",true);
  }
}
