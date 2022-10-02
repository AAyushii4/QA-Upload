package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.name("name")).sendKeys("Ayushi");
	        browserObject.findElement(By.id("eml")).sendKeys("abc.gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("google.com");
	        browserObject.findElement(By.name("comment")).sendKeys("good");
	        browserObject.findElement(By.name("submit")).click();
	

}
}