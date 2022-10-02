package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		WebElement RBfemale = Driver.findElement(By.xpath("//input[@value='female']"));
		WebElement RBmale = Driver.findElement(By.xpath("//input[@value='male']"));
		WebElement RBother = Driver.findElement(By.xpath("//input[@id='other']"));
		//WebElement send = Driver.findElement(By.xpath("input[@name='submit']"));//
		
		RBfemale.click();
		Thread.sleep(5000);
		RBmale.click();
		Thread.sleep(6000);
		Driver.findElement(By.name("submit")).click();
	}
}
