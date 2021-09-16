package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefoxAfterDelay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        
        Thread.sleep(5000);
        driver.close();
	}

}
