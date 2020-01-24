package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class Logintest {

	public static void main(String[] args) {
		
		
		//chrome driver
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	//	System.setProperty("webdriver.gecko.driver", "E:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver-v0.26.0-win64 \\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
driver.get("http://demowebshop.tricentis.com/login");
driver.manage().window().maximize();
driver.findElement(By.name("Email")).sendKeys("d170@yahoo.com");
driver.findElement(By.id("Password")).sendKeys("password");
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
driver.close();

	}

}
