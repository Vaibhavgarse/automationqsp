package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InocationCount {
  @Test(invocationCount = 20)
  public void f() {
	  Reporter.log("Vaibhav",true);
  }
}
