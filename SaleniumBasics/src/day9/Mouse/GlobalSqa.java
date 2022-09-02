package day9.Mouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GlobalSqa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act=new Actions(driver);
		// frame handling
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
//		List<WebElement> Sources=driver.findElements(By.cssSelector("ul#gallery>li"));
		//By Xpath
		List<WebElement> Sources=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		WebElement Target=driver.findElement(By.cssSelector("div#trash"));
		
		act.dragAndDrop(Sources.get(0), Target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(Sources.get(1), Target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(Sources.get(2), Target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(Sources.get(3), Target).build().perform();

	}

}
