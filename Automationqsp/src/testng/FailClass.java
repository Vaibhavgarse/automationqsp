package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailClass {
  @Test
  public void d() {
	  Reporter.log("Failes class",true);
	  int i=10;
	  int result=i/0;
	  System.out.println(result);
  }
}
