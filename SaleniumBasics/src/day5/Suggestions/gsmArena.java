package day5.Suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmArena {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("Samsung")).click();
		
		List<WebElement> phoneCount=driver.findElements(By.cssSelector("ul>li>a"));
		
		System.out.println("GSM Arena phone Count is: "+phoneCount.size());
		
		for(int i=0; i<phoneCount.size();i++) {
			System.out.println(phoneCount.get(i).getText());


	}
	

	}
}

