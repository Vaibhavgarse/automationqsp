package testnfanotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description {
  @Test(description ="HI")
  public void DescriptionFlag() {
	  Reporter.log("Description Anotation");
  }
}
