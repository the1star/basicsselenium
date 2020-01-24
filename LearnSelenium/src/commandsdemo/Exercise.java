package commandsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String actualname=driver.getTitle();
		System.out.println("actualname:"+actualname);
		String expectedname="Demowebshop";
		@SuppressWarnings("unused")
		int length=actualname.length();
		System.out.println("length of the page " + actualname.length());
		
		if(expectedname.equals(actualname)){
			System.out.println("okay title");
			
		}
		else{
			System.out.println("incorrect title");
		}
		
		String expecteurl="http://demowebshop.tricentis.com";
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
		if(expecteurl.equals(actualurl)){
			System.out.println("okay url");
			
		}
		else{
			System.out.println("incorrect url");
		}
		
		String sourcecode=driver.getPageSource();
	System.out.println(sourcecode);
	//	String code=driver.get

		@SuppressWarnings("unused")
		int lengthi=sourcecode.length();
		System.out.println(sourcecode.length());
		driver.close();
	}

}
