package commandsdemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
	 	List<WebElement>iframescount=driver.findElements(By.tagName("iframe"));
	 	System.out.println("no of frames"+iframescount.size());
		for(int i=0;i<iframescount.size();i++)
				//(i).getAttribute("name"));
				{
					System.out.println(iframescount.get(i).getAttribute("name"));
				}
	 	// switch to frame
	 	
				WebElement frame=driver.findElement(By.xpath("//*[@id='Single']//iframe"));
				driver.switchTo().frame(frame);
	 	
				
				//enter the valu into textbox
			WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
			textbox.sendKeys("hey didi");
	 	
			Thread.sleep(1000);

			driver.switchTo().defaultContent();
			WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
			secondtab.click();
			driver.switchTo().frame(1);
			Thread.sleep(1000);

			driver.switchTo().frame(0);
			
			WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
			textbox2.sendKeys("webdriver");
			
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
			driver.close();
			
			
	/*	driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
	 	driver.findElement(By.xpath("//div[@class='row']"));
	 	driver.switchTo().frame(0);
	 	driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Divi");
	 	Thread.sleep(1000);
	 	driver.close();*/
	}
}
