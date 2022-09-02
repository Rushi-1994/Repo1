package day9.Mouse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragOpe {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Using WebDriverManager setUp the required browser executable file
				WebDriverManager.chromedriver().setup();
				// step2: create an instance of Chrome Browser
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);
				driver.manage().window().maximize();
                driver.get("https://the-internet.herokuapp.com/drag_and_drop");
				
//				WebElement frame = driver.findElement(By.cssSelector("#content"));
//				driver.switchTo().frame(frame);

				// create an instance of Actions class by passing required browser instance to
				// its constructor
				Actions act=new Actions(driver);
				
				WebElement SourceEle=driver.findElement(By.id("column-a"));
				WebElement targetEle=driver.findElement(By.id("column-b"));
				
				act.dragAndDrop(SourceEle, targetEle).build().perform();
				Thread.sleep(2000);
//				act.dragAndDrop(targetEle, SourceEle).build().perform();
				

	}

}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
/*				
				//to enter required application URL use get() of WebDriver interface
				// to enter required application URL use get() of WebDriver interface
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
				// frame handling
				WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
				driver.switchTo().frame(frame);

				// create an instance of Actions class by passing required browser instance to
				// its constructor
				Actions act = new Actions(driver);

				List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
				WebElement target = driver.findElement(By.id("trash"));

				act.dragAndDrop(sourceElements.get(0), target).build().perform();
				Thread.sleep(1000);
//				act.dragAndDrop(sourceElements.get(1), target).build().perform();
//				Thread.sleep(1000);
//				act.dragAndDrop(sourceElements.get(2), target).build().perform();
				
//				performDranAndDrop(act, sourceElements.get(1), target);
//			}
			
//			static void performDranAndDrop(Actions act,WebElement src,WebElement target) {
//				act.dragAndDrop(src, target).build().perform();
//			}

				
	}
}
				
	*/		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
