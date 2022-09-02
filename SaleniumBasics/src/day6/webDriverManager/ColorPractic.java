package day6.webDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorPractic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement radioButton=driver.findElement(By.cssSelector("div.left-align>fieldset>legend:nth-of-type(1)"));
		
		System.out.println("Font size for Radio button is: "+radioButton.getCssValue("font-size"));
		System.out.println("color for Radio button is: "+radioButton.getCssValue("color"));
		System.out.println("Background color for Radio button is: "+radioButton.getCssValue("background"));
		
		WebElement openWindow=driver.findElement(By.id("openwindow"));
		System.out.println("****************************************");
		System.out.println("Font size for Open Window is: "+openWindow.getCssValue("font-size"));
		System.out.println("color for Open Window is: "+openWindow.getCssValue("color"));
		System.out.println("Background Color for Open Window is: "+openWindow.getCssValue("background"));

	}

}
