package commandsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1=driver.switchTo().alert();
		String alerttitle=driver.switchTo().alert().getText();
		System.out.println	(" alert title is"+alerttitle);
		Thread.sleep(1000);
		alert1.accept();
		driver.close();
	}

}
