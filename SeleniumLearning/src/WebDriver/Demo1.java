package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
		
		WebDriver driver = new ChromeDriver(); // storing chromedriver in object called "driver"
		driver.manage().window().maximize(); // to maximize the window screen
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@name ='txtUsername']")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id = 'btnLogin']")).click();
		String ExpectedTitle = "OrangeHRM";
		Thread.sleep(3000);
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
			{
				driver.findElement(By.xpath("//*[@id = 'welcome']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id = 'welcome-menu']/ul/li[2]/a")).click();
			}
		
		else {
			System.out.println("Title is not matching");
			}
		
		driver.close(); // this will close the opened instance of the driver browser
		driver.quit(); // to close multiple browser opened through instance
		
	}
}
