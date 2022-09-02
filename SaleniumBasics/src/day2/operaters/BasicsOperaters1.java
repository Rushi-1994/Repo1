package day2.operaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOperaters1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do"); 
		
		String actualCurrentUrl=driver.getCurrentUrl();
		String exceptedUrl="https://demo.actitime.com/login.do";
		System.out.println("Validation Of URL is: "+actualCurrentUrl.contains(exceptedUrl));
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement loginbtn=driver.findElement(By.id("loginButton"));
		
		loginbtn.click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		
//		driver.close();

	}

}
