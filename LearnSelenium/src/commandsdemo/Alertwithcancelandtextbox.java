package commandsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithcancelandtextbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	/*	
	  	1
	 
	 	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1=driver.switchTo().alert();
		String alerttitle=driver.switchTo().alert().getText();
		System.out.println	(" alert title is"+alerttitle);
		Thread.sleep(1000);
		alert1.accept();  
		
		2
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2=driver.switchTo().alert();
		String alerttitl=driver.switchTo().alert().getText();
		System.out.println	(" alert title is"+alerttitl);
		Thread.sleep(1000);
		alert2.dismiss(); 
		
		3
		*/
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();		
		Alert alert3=driver.switchTo().alert();
		String alerttitll=driver.switchTo().alert().getText();
		System.out.println	(" alert title is"+alerttitll);
		Thread.sleep(3000);
		alert3.sendKeys("i am divi");
		Thread.sleep(3000);

		alert3.accept();
		Thread.sleep(3000);

		driver.close();
	
	}
}
