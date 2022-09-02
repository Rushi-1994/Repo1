package day1.openBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		
		String actualTitle=driver.getTitle();
		String exceptedTitle="actiTIME";
		System.out.println("Actual URL Is: "+actualTitle);
		System.out.println("Excepted URL Is: "+exceptedTitle);
		System.out.println("Validation Of URl Is: "+actualTitle.contains(exceptedTitle));
		System.out.println("Title Length is: "+actualTitle.length());
		
		
		String actualCurrentUrl=driver.getCurrentUrl();
		String exceptedUrl="https://demo.actitime.com";
		System.out.println("Actual URL Is: "+actualCurrentUrl);
		System.out.println("Excepted URL Is: "+exceptedUrl);
		System.out.println("Validation Of URl Is: "+actualCurrentUrl.contains(exceptedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("PageSource Length is: "+pageSource.length());
		
		driver.close();
		

	}

}
