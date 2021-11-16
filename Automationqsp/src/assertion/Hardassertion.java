package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hardassertion {
	@Test
	public void a()
	{
		Reporter.log("Launch the browser",true);
		Reporter.log("Launch the web application",true);
		Assert.assertEquals(false, true);// it is used for basic and critical features tgo check its working or not
		Reporter.log("Login to the browser",true);
		Reporter.log("verify the home page",true);
	}

}
