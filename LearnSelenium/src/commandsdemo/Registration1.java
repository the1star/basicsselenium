package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.id("Email")).sendKeys("d0@yahoo.com");
		driver.findElement(By.id("FirstName")).sendKeys("Lokmani");
		driver.findElement(By.name("LastName")).sendKeys("Sharma");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		
		
		String expectedname="Demostaar";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		
		if(expectedname.equals(actualname)){
			System.out.println("okay title");
			
		}
		else{
			System.out.println("incorrect title");
		}
		
		
		
		
		
		
		driver.close();
		
		
	}

}
