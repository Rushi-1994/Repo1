package day9.Mouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMouseOpe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		
		WebElement Ecp=driver.findElement(By.cssSelector("div._2QfC02>button"));
		Ecp.sendKeys(Keys.ESCAPE);
		
		List<WebElement> MainManu=driver.findElements(By.cssSelector("div>div>div>.eFQ30H>a"));
		System.out.println("Main Menu Count is: "+MainManu.size());
		for(int i=0; i<MainManu.size(); i++) {
			System.out.println(MainManu.get(i).getText());
		}
		Actions act=new Actions(driver);
		
		act.moveToElement(MainManu.get(0)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(1)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(2)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(3)).perform();
		Thread.sleep(1000);
		
		
		
		
		act.moveToElement(MainManu.get(4)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(5)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(6)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(7)).perform();
		Thread.sleep(1000);
		act.moveToElement(MainManu.get(8)).perform();
/*		
		for(int i=0; i<MainManu.size(); i++) {
			WebElement option=MainManu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
		}
*/
	}

}
