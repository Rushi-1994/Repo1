package day7.xPathPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> phoneName=driver.findElements(By.xpath("//a[2][@class='nav-a  ']"));
		
		List<WebElement> phonePrice=driver.findElements(By.xpath("//div[div[h2[a[span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)']]]]]/div[3]/div[2]/a/span[1]/span[2]/span[2]"));
		
		for(int i=0;i<phonePrice.size();i++) {
			System.out.println(phonePrice.get(i).getText());
		
		

	}
	}
}
