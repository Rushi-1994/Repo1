package day1.openBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Acceleration\\Workspace\\SaleniumBasics\\execuitables\\geckodriver.exe");
		FirefoxDriver edriver=new FirefoxDriver();
		edriver.get("https://www.google.com");
		edriver.get("https://www.flipkart.com");

	}

}
