package day2.operaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOperaters {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		
		String actualCurrentUrl=driver.getCurrentUrl();
		String exceptedUrl="https://opensource-demo.orangehrmlive.com/";
		System.out.println("Validation Of URL is: "+actualCurrentUrl.contains(exceptedUrl));
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.name("txtPassword"));
		pwd.sendKeys("admin123");
		WebElement loginbtn=driver.findElement(By.className("button"));
		loginbtn.click();
		driver.close();
		
		

	}

}
