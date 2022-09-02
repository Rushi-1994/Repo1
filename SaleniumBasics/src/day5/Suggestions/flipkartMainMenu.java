package day5.Suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartMainMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		List<WebElement> flipkartMenu=driver.findElements(By.cssSelector("div div.xtXmba"));
		
		System.out.println("Flipkart Menu Count is: "+flipkartMenu.size());
		
		for(int i=0; i<flipkartMenu.size();i++) {
			System.out.println(flipkartMenu.get(i).getText());


	}
	}
}
