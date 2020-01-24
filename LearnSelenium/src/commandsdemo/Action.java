package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Divyakant sharma");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	
	
	}

}
