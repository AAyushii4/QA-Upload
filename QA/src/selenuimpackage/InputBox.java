package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		Driver.findElement(By.name("name")).sendKeys("Ayushi");
		Driver.findElement(By.id("eml")).sendKeys("aucnaik12@gmail.com");
		Driver.findElement(By.name("website")).sendKeys("google.com");
		Driver.findElement(By.name("comment")).sendKeys("practice selenium");
		Driver.findElement(By.name("submit")).click();
		Driver.close();
	}

}
