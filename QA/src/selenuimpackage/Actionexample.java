package selenuimpackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		Actions Ayu = new Actions(Driver);
		WebElement RightClick = Driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Ayu.contextClick(RightClick).build().perform();
		//Action.contextClick(rightClickElement).build().perform();
		
	}

}
