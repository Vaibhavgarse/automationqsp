package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class IdTag
{
public static void main(String [] args)
{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com")
driver.manage().windows().maximize();
driver.findElement().activeElement().sendKeys("Arjit sing");
driver.findElement().activeElement().click();
}
}