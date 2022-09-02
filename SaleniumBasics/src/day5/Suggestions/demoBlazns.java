package day5.Suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlazns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		
		List<WebElement> phoneTitle=driver.findElements(By.cssSelector("div#tbodyid h4>a"));
		List<WebElement> phonePrise=driver.findElements(By.cssSelector("div#tbodyid h5"));
		System.out.println("Phone Title Count is: "+phoneTitle.size());
		
		for(int i=0; i<phoneTitle.size();i++) {
			System.out.println(phoneTitle.get(i).getText()+" "+phonePrise.get(i).getText());

	}
	}
}
