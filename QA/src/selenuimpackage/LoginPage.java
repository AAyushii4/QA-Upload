package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        WebElement email= browserObject.findElement(By.id("Email"));
	        WebElement password= browserObject.findElement(By.name("Password"));
	        email.clear();
	        password.clear();
	        email.sendKeys("admin@yourstore.com");
	        password.sendKeys("admin");
	        browserObject.findElement(By.className("button-1")).click();
	    browserObject.close();    
	}

}
