package testanotaionForActitime;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActitimeLogin extends BeseTest {
  @Test
  public void Login() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Thread.sleep(3000);
	  driver.findElement(By.id("loginButton")).click();
  }
}
