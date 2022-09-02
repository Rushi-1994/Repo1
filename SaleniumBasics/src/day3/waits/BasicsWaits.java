package day3.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String pageTitle=driver.getTitle();
		System.out.println("PAge Title is: "+pageTitle);
		System.out.println("Page Title length is: "+pageTitle.length());
		String ExceptedPageTitle="OrangeHRM";
		
		System.out.println("Title Validation Status is: "+pageTitle.equals(ExceptedPageTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("PageUrl is: "+pageUrl);
		String ExceptedUrl="https://opensource-demo.orangehrmlive.com/";
		
		System.out.println("PageUrl validatoin Status is: "+pageUrl.contains(ExceptedUrl));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String homepageURL=driver.getCurrentUrl();
		System.out.println("PAge Title is: "+homepageURL);
		System.out.println("Validatoin of Homepage Title is: "+homepageURL.equals(ExceptedUrl));
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
		
		
		
		
		

	}

}
