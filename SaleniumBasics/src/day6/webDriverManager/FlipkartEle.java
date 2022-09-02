package day6.webDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartEle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		
		try {
			driver.findElement(By.cssSelector("div>div>button._2KpZ6l")).click();
		}catch (Throwable e){
			System.out.println("Exception handled.." +e);
		}
		
		driver.findElement(By.cssSelector("div.InyRMC>div>div:nth-of-type(5) div.xtXmba")).click();

	}

}
