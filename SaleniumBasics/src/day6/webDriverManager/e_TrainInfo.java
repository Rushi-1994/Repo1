package day6.webDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e_TrainInfo {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://etrain.info/in");
		//From pune
		driver.findElement(By.cssSelector("#tbsfi1")).sendKeys("PUNE JN");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div#et_autocomplete>div>a>b")).click();		
		
//		driver.findElement(By.cssSelector("div.ui-autocomplete>div>a>b")).click();

//		driver.findElement(By.cssSelector("div[style='position: absolute; left: 191.6px; top: 115.8px; width: 250px;']>div>a")).click();
		//to Mumbai
		driver.findElement(By.cssSelector("input[name='station2']")).sendKeys("MUMBAI CST");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.ui-menu>div#suggest_row1>a")).click();
		
//      driver.findElement(By.id("et_autocomplete")).click();
//		driver.findElement(By.cssSelector("div.ui-autocomplete>div>a>b")).click();
		
		driver.findElement(By.className("datepicker")).click();	
		//date from next month
		driver.findElement(By.cssSelector("input[class='nav']")).click();
		//Select Date
		driver.findElement(By.cssSelector("div.dpdd>table>tbody>tr:nth-of-type(5)>td:nth-of-type(7)>input")).click();
		
//		driver.findElement(By.cssSelector("div.modalChild>a>i.icon-cancel")).click();
		//Quota as tatkal
		driver.findElement(By.cssSelector("div.mrgd>span>#tbsfi5>option:nth-of-type(2)")).click();
		//get trains
//		driver.findElement(By.id("tbssbmtbtn")).click();
		driver.findElement(By.cssSelector("div#leftbar div:last-child>div.f-hvcenter>#tbssbmtbtn")).click();
		//Print Train No.
		List<WebElement> TrainNo=driver.findElements(By.cssSelector("table.nolrborder td.wd55>a.exp"));
		System.out.println("Train No. Count is: "+TrainNo.size());
		
		for(int i=0;i<TrainNo.size();i++) {
			System.out.println(TrainNo.get(i).getText());
		}

	}

}
