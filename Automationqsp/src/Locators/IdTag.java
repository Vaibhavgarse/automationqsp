package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdTag
{
public static void main(String [] args)
{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.findElement(By.id("")).click();
driver.findElement(By.id("")).click();
driver.findElement(By.partialLinkText("")).click();
}
}