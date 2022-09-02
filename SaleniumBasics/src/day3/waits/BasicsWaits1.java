package day3.waits;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsWaits1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\Acceleration\\Workspace\\Da5\\PropertyFile\\OrangrHRM.Property");
		Properties prop=new Properties();
		prop.load(fis);
		
		String driverkey=prop.getProperty("driverkey");
		String ExecuitedPath=prop.getProperty("ExecuitedPath");
		String applicationUrl=prop.getProperty("applicationUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String exceptedloginPageTitle=prop.getProperty("loginPageTitle");
		String SignInbuttonname=prop.getProperty("buttonname");
		
		System.out.println(driverkey+"\n"+applicationUrl+"\n"+username+"\n"+password+"\n"+exceptedloginPageTitle+"\n"+SignInbuttonname);
		
		
		System.setProperty(driverkey, ExecuitedPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String pagetitle=driver.getTitle();
		System.out.println("Page Title is: "+pagetitle);
		String exceptedPageTitle="vtiger";
		System.out.println("Page Title Valification is: "+pagetitle.equals(exceptedPageTitle));
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.className("buttonBlue")).click();
		
		String homepageURl=driver.getCurrentUrl();
		System.out.println("Current Url is: "+homepageURl);
		System.out.println("Validation Of Home page is: "+homepageURl.equals(homepageURl));
		
//		driver.findElement(By.className(homepageURl));
		//Add Widget Button
//		driver.findElement(By.className("addButton")).click();
		driver.findElement(By.cssSelector(".addButton")).click();
		// Add History
		driver.findElement(By.cssSelector("[data-name='History']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("[data-name='OverdueActivities']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		//Add open Tickets
		driver.findElement(By.cssSelector("a[data-name='OpenTickets']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		//Add Upcoming Actives
		driver.findElement(By.cssSelector("[data-name='CalendarActivities']")).click();
		
		
		driver.findElement(By.cssSelector(".userName")).click();
		
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		
		
        
		

	}

}
