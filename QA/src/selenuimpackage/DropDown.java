package selenuimpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		Select country = new Select(Driver.findElement(By.name("country")));
		country.selectByVisibleText("India");
		country.selectByVisibleText("USA");
		
		Select Skill = new Select(Driver.findElement(By.name("skill")));
		Skill.selectByVisibleText("Programing");
		Skill.selectByVisibleText("Database");
		System.out.println("selectByVisibleText(Database");
		Driver.findElement(By.name("submit")).click();
		//skill select kre no output//
		Driver.close();
		
	}

}
