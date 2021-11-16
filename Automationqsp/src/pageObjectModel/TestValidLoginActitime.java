package pageObjectModel;

import java.io.IOException;

public class TestValidLoginActitime extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		
		Flib flib=new Flib();
		String urn = flib.readPropertyData(PROP_PATH, "username");
		String pass = flib.readPropertyData(PROP_PATH, "password");
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		/*lp.getUsn().sendKeys(urn);
		lp.getPass().sendKeys(pass);
		lp.getLoginbutton().click();*/
		//sing method for login
		lp.actiTimeLoginValid(urn, pass);

	}

}
