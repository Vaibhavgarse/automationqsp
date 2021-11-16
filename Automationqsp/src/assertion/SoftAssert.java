package assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void s()
	{
		Reporter.log("Launch the browser",true);
		Reporter.log("Launch the we application",true);
		Reporter.log("verify the page title ",true);
		org.testng.asserts.SoftAssert softasssert = new org.testng.asserts.SoftAssert();
		softasssert.assertEquals(false, true);
		Reporter.log("Login to web application",true);
		Reporter.log("verify the home page title ",true);
		softasssert.assertAll();// this line used to give the assertion actual result othervise it will shows only pass
		
	}

}
