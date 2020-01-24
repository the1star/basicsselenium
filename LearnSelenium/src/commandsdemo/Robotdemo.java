package commandsdemo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotdemo {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://topdf.com/");
		
		Robot robot=new Robot();
		robot.setAutoDelay(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Upload Files')]")).click();
		
		StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Desktop\\f.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
	    robot.setAutoDelay(2000);
	    
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		driver.close();
		
	}

}
