package selenuimpackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://admin-demo.nopcommerce.com/login\"");
		WebElement ID = Driver.findElement(By.id("Email"));
		WebElement Password = Driver.findElement(By.name("Password"));
		ID.clear();
		ID.sendKeys("admin@yourstore.com");
		Password.clear();
		Password.sendKeys("admin");
		//WebElement Login = Driver.findElement(By.className("button-1"));
		Driver.findElement(By.className("button-1")).click();
		//Login.submit();
		//Driver.close();
		
	}

}
