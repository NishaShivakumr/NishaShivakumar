package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseOver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		// to get click on login button using actions -- to click on enter in keyboard
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.RETURN).perform();
		
		Thread.sleep(3000);
		
		// to click on tab 3 times
		
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		
		
		

	}

}
