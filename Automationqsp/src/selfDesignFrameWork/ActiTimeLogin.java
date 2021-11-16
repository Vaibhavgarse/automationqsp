package selfDesignFrameWork;

import java.io.IOException;

public class ActiTimeLogin extends BaseTest{

	public static void main(String[] args) throws IOException {
		Flib flib=new Flib();
		BaseTest bt=new BaseTest();
		bt.setUp();
		String username = flib.readProperty(PROP_PATH, "username");
		String password = flib.readProperty(PROP_PATH, "password");
		LoginPage lp = new LoginPage(driver);
		lp.loginValid(username, password);

	}

}
