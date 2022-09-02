package day5.Suggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//Explicit Wait
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//click on task tab 
		driver.findElement(By.cssSelector(".tasks")).click();
		//validate task page
		String taskpageTitle=driver.getTitle();
		System.out.println("Task Page Title is: "+taskpageTitle);
		System.out.println("Task Page Title length is: "+taskpageTitle.length());
		String ExceptedPageTitle="actiTIME - Task List";
		System.out.println("Title Validation Status is: "+taskpageTitle.equals(ExceptedPageTitle));
		//click on "add new"
		driver.findElement(By.className("addNewButton")).click();
		//select "new task"
		driver.findElement(By.className("createNewTasks")).click();
		//select customer
		driver.findElement(By.cssSelector("div.customerSelector div.selectedItem")).click();
		//Galaxy CorporationGalaxy Corporation
		driver.findElement(By.cssSelector("div>.searchItemList>div:nth-of-type(4)")).click();
		//Click On New Project
		driver.findElement(By.cssSelector("div.projectSelector div.selectedItem")).click();
		//select Project "Android Testing"
		driver.findElement(By.cssSelector("div>.searchItemList>div:nth-of-type(5)")).sendKeys("Android Testing");
		
		

	}

}
