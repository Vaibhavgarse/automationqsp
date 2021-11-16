package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependonMethod {
  @Test
  public void login() {
	  Reporter.log("login",true);
  }
  @Test(dependsOnMethods = "login")
  public void Action() {
	  Reporter.log("Action",true);
  }
  @Test(dependsOnMethods = "Action",priority = 2)
  public void logout() {
	  Reporter.log("Logout",true);
  }
}
