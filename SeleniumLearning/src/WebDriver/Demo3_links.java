package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://opensource-demo.orangehrmlive.com/");
	Driver.manage().window().maximize();
	
	Driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	WebElement Username = Driver.findElement(By.name("txtUsername"));
	System.out.println(Username.getAttribute("value"));
	
	Driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	Driver.findElement(By.id("btnLogin")).click();
	
	Driver.findElement(By.id("menu__Performance")).click();
	List<WebElement> Linklists = Driver.findElements(By.tagName("a"));
	System.out.println("The total no. of links are " + Linklists.size());
	
	// to print the name of the links
	
	for (WebElement  e:Linklists)
		{
			String linknames = e.getText();
			System.out.println(linknames);
		}
	
	
		
	Driver.close();
	
	}

}
