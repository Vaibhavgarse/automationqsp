package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRun {
  @Test
  public void login() {
	  int i=10/0;
	  System.out.println(i);
	  Reporter.log("login",true);
  }
  @Test(dependsOnMethods = "login",alwaysRun=true)
  public void Action() {
	  Reporter.log("Action",true);
  }
  @Test(dependsOnMethods = "Action",priority = 2)
  public void logout() {
	  Reporter.log("Logout",true);
  }
}
