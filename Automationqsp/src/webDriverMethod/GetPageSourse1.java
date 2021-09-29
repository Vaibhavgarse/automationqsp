package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourse1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Sourse = driver.getPageSource();
		System.out.println(Sourse);

	}

}
