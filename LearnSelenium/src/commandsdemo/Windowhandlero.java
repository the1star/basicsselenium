package commandsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlero {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println("title of main page:"+driver.getTitle());
		WebElement tabwindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabwindow.click();
		Set<String>windowids=driver.getWindowHandles();
		Iterator<String>iter=windowids.iterator();
			//	iter.next();
		String mainWindow=iter.next();
		String childWindow=iter.next();
		driver.switchTo().window(childWindow);
		System.out.println("the title of child window ="+driver.getTitle());
		driver.close();
		driver.switchTo().window(mainWindow);
	//	driver
		
		
		
}
}