package commandsdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {
	
	public static void main(String[] args) {
		Logger log= Logger.getLogger(Log4jdemo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
		log.info("Application started sucessfully");
	
		String expectedtitle="Google";
		String actualtitle=driver.getTitle();
		
		log.warn("check status");
		
		if(expectedtitle.equals(actualtitle)){
			System.out.println("Correct Tittle");
			log.info("correct title");
			driver.close();
		}
		else{
			System.out.println("incorrect title");
		}

	}
}