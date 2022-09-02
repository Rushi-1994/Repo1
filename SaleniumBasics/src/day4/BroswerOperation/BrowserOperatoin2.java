package day4.BroswerOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperatoin2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().window().setSize(new Dimension(500, 800));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.close();

	}

}
