package day5.Suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crickInfomenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		Thread.sleep(2000);
		
		List<WebElement> crickInfoMenu=driver.findElements(By.cssSelector("div a.ci-nav-item"));
		
		System.out.println("Crick Info Menu Count is: "+crickInfoMenu.size());
		
		for(int i=0; i<crickInfoMenu.size();i++) {
			System.out.println(crickInfoMenu.get(i).getText());


	}
	}

	}



