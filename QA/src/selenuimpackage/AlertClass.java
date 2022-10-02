package selenuimpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver BrowserObject = new ChromeDriver();
		BrowserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		BrowserObject.findElement(By.id("alert")).click();
		Alert alert = BrowserObject.switchTo().alert();
		
//alert.accept();

		
		
		
		
	}

}
