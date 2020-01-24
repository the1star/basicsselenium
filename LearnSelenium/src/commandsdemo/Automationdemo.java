package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationdemo {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Divyakant");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sharma");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("banglore near manipal county");
		//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-tou']")).sendKeys("d170@yahoo.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9466705944");
		driver.findElement(By.xpath("//body[@class='ng-scope']/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[@class='form-group']/div[@class='col-md-4 col-xs-4 col-sm-4']/label[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	  //driver.findElement(By.xpath("//input[@name='radiooptions'and @value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@name='radiooptions'and @value='Male']")).click();
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sell=new Select(year);
		sell.selectByVisibleText("1918");
		//input[@name='radiooptions and@value='FeMale']
		
		
		driver.close();
	}
}
