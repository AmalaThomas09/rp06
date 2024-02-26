package gitproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitProject {
	public static void main(String[] args) {
		System.out.println("Stc first demo test by using main method");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dreams\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
 driver.get("https://www.flipkart.com");
	}

}


	
		// TODO Auto-generated method stub

	

