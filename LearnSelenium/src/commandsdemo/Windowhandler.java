package commandsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandler {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
	 	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		//driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("d170@yahoo.com");
	//	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

//		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
		
        String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                      //  driver.close();		
            }		
        }		
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
    }
}		
