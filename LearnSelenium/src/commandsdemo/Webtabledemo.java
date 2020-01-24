package commandsdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemo {


		public static void main(String[] args) {
			Logger log= Logger.getLogger(Log4jdemo.class);
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("C:\\Users\\IBM\\Desktop\\tools.html");
			String str=driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]")).getText();
			log.info("Application started sucessfully");
			System.out.println(str);
			driver.close();
	}

}
