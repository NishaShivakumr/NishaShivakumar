package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyLinks {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		//I am trying to get the title of under construction and store in a variable
		
		String underconsttitle = "Under Construction: Mercury Tours";
		
		//to click on all the links
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		// storing the size of the links in tha variable 
		
		String[] linktext = new String[links.size()];
		
		int i=0;
		
		for (WebElement e:links)
			
		{
			linktext[i]=e.getText(); 
			i++;
		}
		
		//check whether each link is working or not 
		
		for(String t:linktext) //storing linksize in t
		{
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underconsttitle))
			{
				System.out.println("\"" + t + "\" + is underconstruction");
			
			}
			
			else
			{
				System.out.println("\"" + t + "\" + is working");
			}
			
			driver.navigate().back();
				
		}
		
		driver.close(); // to close the current browser/active browser
		
		driver.quit(); // to close all the browser which are opened through the selenium instance 
		
		//there is no return type between driver.close() and driver.quit() and will not accept any arguments

	}

}
