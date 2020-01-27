package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // to delete all cookies
		
		//NAVIGATION METHODS
		//Navigation 1
		
		driver.navigate().to("http://newtours.demoaut.com/");
		
		WebElement link = driver.findElement(By.linkText("Cruises"));
		
		//Actions
		Actions MH = new Actions(driver);
		
		//Mouseover on cruises
		Action mouseover = MH.moveToElement(link).build();
		
		//will move the mouse over to that element
		mouseover.perform();
		
		//Is to click enter from keyboard
		//MH.sendKeys(link,(Keys.ENTER)).perform();
		MH.sendKeys(link,(Keys.RETURN)).perform();
		

	}

}
