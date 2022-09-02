package day8.KeyboardOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //Open URL
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	    WebElement FirstName=driver.findElement(By.xpath("//div/input[1]"));
	    FirstName.sendKeys("Admin",Keys.chord(Keys.CONTROL,"a"));
	    FirstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	    
	    WebElement LastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	    LastName.sendKeys(Keys.TAB);
	    
	    WebElement Adress=driver.findElement(By.xpath("//div/div/textarea"));
	    Adress.sendKeys("Malegaon Road Taroda (KH) Nanded.");
	    Adress.sendKeys(Keys.TAB);
	    
	    WebElement Email=driver.findElement(By.xpath("//div/form/div[3]/div/input"));
	    Email.sendKeys("Rushi@gmail.com");
	    Email.sendKeys(Keys.TAB);
	    
	    WebElement phoneNumber=driver.findElement(By.xpath("//div/form/div[4]/div/input"));
	    phoneNumber.sendKeys("8208126752");
	    phoneNumber.sendKeys(Keys.TAB);
	    
	    //Gender
	    driver.findElement(By.xpath("//div/form/div[5]/div/label[1]/input")).click();
	    //Hobbies
	    driver.findElement(By.xpath("//div/form/div[6]/div/div[2]/input")).click();
	    
	    WebElement Select=driver.findElement(By.xpath("//body"));
	    
	    for(int i=0; i<2; i++) {
	    	Select.sendKeys(Keys.PAGE_DOWN);
	    }
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//div/form/div[7]/div/multi-select/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div/form //ul/li[8]/a")).click();
	    
	    driver.findElement(By.xpath("//div/form/div[8]/div/select/option[7]")).click();
	    //Select Country
	    driver.findElement(By.xpath("//div/form/div[10]/div/span/span[1]/span/span[2]")).click();
	    
	    driver.findElement(By.xpath("//span/span/span[2]/ul/li[6]")).click();
	    //Select Year    
	    driver.findElement(By.xpath("//div/form/div[11]/div[1]/select/option[@value='1994']")).click();
	    //Select Month
	    driver.findElement(By.xpath("//div/form/div[11]/div[2]/select/option[9]")).click();
	    //Select Date
	    driver.findElement(By.xpath("//div/form/div[11]/div[3]/select/option[2]")).click();
	    //Password
	    WebElement pwd=driver.findElement(By.xpath("//input[@id='firstpassword']"));
	    pwd.sendKeys("Test@123",Keys.chord(Keys.CONTROL,"a"));
	    pwd.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	    
	    WebElement CnfPwd=driver.findElement(By.xpath("//input[@id='secondpassword']"));
	    CnfPwd.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	    CnfPwd.sendKeys(Keys.ENTER);
	    

	}

}
