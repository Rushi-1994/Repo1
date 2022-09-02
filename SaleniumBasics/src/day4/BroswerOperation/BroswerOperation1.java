package day4.BroswerOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerOperation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("Forgot Password Page Title is: "+driver.getTitle());
		driver.navigate().back();
		System.out.println("Forgot Password Page Title is: "+driver.getTitle());
		driver.navigate().forward();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().window().setSize(new Dimension(500, 600));
		

	}

}
