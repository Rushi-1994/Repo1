package day5.Suggestions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class vTigher {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//Explicit Wait
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.className("buttonBlue")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		driver.findElement(By.cssSelector("[data-name=\"History\"]")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("[data-name=\"GroupedBySalesStage\"]")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("[data-name=\"TotalRevenuePerSalesPerson\"]")).click();
		
		driver.findElement(By.cssSelector("div.footerIcons> a.widget>i.fa-remove")).click();
		driver.findElement(By.className("confirm-box-ok")).click();
		
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("div.footerIcons> a.widget>i.fa-remove")).click();
		driver.findElement(By.className("confirm-box-ok")).click();
		
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("div.footerIcons> a.widget>i.fa-remove")).click();
		driver.findElement(By.className("confirm-box-ok")).click();
		
		driver.findElement(By.cssSelector("[title='Atlas Jeniffer(admin)']")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		driver.close();
		
	
	}
		

	}

