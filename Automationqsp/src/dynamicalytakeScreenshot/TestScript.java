package dynamicalytakeScreenshot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
@Listeners(CustomListner.class)
public class TestScript extends BaseTest {
  @Test
  public void testFlipkart1() {
	  Assert.fail();
  }
  @Test
 /* public void testFlipkart2() {
	  Assert.fail();
  }
  @Test
  public void testFlipkart3() {
	  Assert.fail();
  }
  @Test
  public void testFlipkart4() {
	  Assert.fail();
  }*/
  @BeforeMethod
  public void setup() {
	  initialization();
	  
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
