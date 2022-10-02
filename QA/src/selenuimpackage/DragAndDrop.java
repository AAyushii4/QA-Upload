package selenuimpackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://jqueryui.com/droppable/");
		Driver.switchTo().frame(0);//what is the frame//
		WebElement source = Driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = Driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		Actions act = new Actions (Driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(5000);
		Driver.close();
	}

}
