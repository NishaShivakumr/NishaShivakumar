package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // to delete all cookies
		
		//NAVIGATION METHODS
		//Navigation 1
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		//to click on Cruises link
		
		driver.findElement(By.linkText("Cruises")).click();
		
		//2nd navigation
		// it will navigate to the back page
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		//3rd navigation
		// it will refresh the page
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//4th navigation
		//it will navigate to the next page
		
		driver.navigate().forward();
		
		driver.close();
					
	}

}



	
