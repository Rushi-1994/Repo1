package day5.Suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("Selenium Interview Questions");
		
		Thread.sleep(2000);
		
		List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println("Suggestion Count is: "+sugg.size());
		
		for(int i=0; i<sugg.size();i++) {
			WebElement element=sugg.get(i);
			System.out.println(element.getText());
			   //or
//			System.out.println(sugg.get(i).getText());
		}

	}

}
