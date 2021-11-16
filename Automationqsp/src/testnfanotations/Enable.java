package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
  @Test(enabled=true)
  public void enable() {
	  Reporter.log("Enable Anotation");
  }
}
