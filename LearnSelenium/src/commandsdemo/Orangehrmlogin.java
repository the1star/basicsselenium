package commandsdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrmlogin {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
			WebDriverWait MYwait=new WebDriverWait(driver,10);//explicit wait
			MYwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		//	Thread.sleep(2000);
			 System.out.println("Okay");
			driver.close();
			
	}

}
