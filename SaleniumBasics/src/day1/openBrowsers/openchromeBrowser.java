package day1.openBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;


public class openchromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\chromedriver.exe");
		
		ChromeDriver edriver=new ChromeDriver();
		
		edriver.get("https://www.google.com");
		edriver.close();

	}

}
