package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpaths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//following-sibling::li[1]//child::a[contains(text(),'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]//parent::li//following-sibling::li[1]//child::a[contains(text(),'WebTable')]")).click();

		
		//a[contains(text();'Computers')]//parent::li//parent::li//parentul//child::li//a[contains(text(),'Electronics');
		
		
		/*	Thread.sleep(1000);
	//	driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to("http://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();*/
	}

}
