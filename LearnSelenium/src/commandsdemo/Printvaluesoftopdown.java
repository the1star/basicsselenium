package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printvaluesoftopdown {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
        Select a = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
        List<WebElement> l = a.getOptions();
       System.out.println("Total Number of item count in dropdown list = "  + l.size());  
        for(int i=0;i<l.size();i++)
        {
        	System.out.println("link names are"+l.get(i).getText());
        }
        driver.close();
		

	}

	
}
