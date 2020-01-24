package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		List<WebElement>Linklist=driver.findElements(By.tagName("a"));
		System.out.println(" total links are: "+Linklist.size());
		for(int i=0;i<Linklist.size();i++){
			System.out.println("link names are: "+Linklist.get(i).getText());
			
		}
	//	driver.close();
		
		
	}

}
