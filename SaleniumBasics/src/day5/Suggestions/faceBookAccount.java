package day5.Suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBookAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
//		List<WebElement> pageination=driver.findElements(By.cssSelector("div.review-nav>div>a"));
		
//		System.out.println("GSM Arena pageination is: "+pageination.size());
		
//		for(int i=0; i<pageination.size();i++) {
//			System.out.println(pageination.get(i).getText());


	}
	

	}

	

