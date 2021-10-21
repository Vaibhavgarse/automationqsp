package dragAndDropOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vaibhav%20Garse/Downloads/dragdrop.html");
		WebElement source = driver.findElement(By.id("draggable-2"));
		WebElement target = driver.findElement(By.id("droppable-2"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();

	}

}
