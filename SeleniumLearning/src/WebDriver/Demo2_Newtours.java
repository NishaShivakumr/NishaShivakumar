package WebDriver;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2_Newtours {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\01AshisDocs\\01ProjectDocs\\02CPC_AT&T\\Automation\\EJBDriver\\EJBDriver\\79\\chromedriver79.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("userName"));// storing an element called username in a variable
		

		if(username.isEnabled())
			{
				username.sendKeys("sunil");
				username.clear();
				username.sendKeys("sunil");
			}
		
		System.out.println(username.getAttribute("value")); // to get the value inside the text box
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		String UN = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText(); // to print the label User Name:
		System.out.println(UN);
		driver.findElement(By.xpath("//*[@name = 'login']")).click();
		//getText - label,dropdown,links
		//getAttribute - Edit box where we pass the values and if any element attribute is dynamic in nature
		
		
		//TO SELECT THE RADIO BUTTON
		
		WebElement RoundTrip = driver.findElement(By.xpath("//*[@name ='tripType' and @value ='roundtrip']"));
		if (RoundTrip.isSelected())
			{
				driver.findElement(By.xpath("//*[@name = 'tripType' and @value = 'oneway']")).click();
			}
		
		//TO WORK ON DROPDOWN
		
		WebElement Dropdown = driver.findElement(By.name("passCount")); // storing an element "dropdown" in a variable called WebElement
		Select sel = new Select(Dropdown); // importing the "Select" method and it is to select the dropdown
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		sel.selectByValue("2");
		
		//sel.selectByValue("3");
		//Thread.sleep(3000);
				
		//sel.selectByIndex(3); 
		//WebElement options2 = sel.getFirstSelectedOption();
		//System.out.println(options2);
		
		
		WebElement Dropdown1 = driver.findElement(By.xpath("//*[@name = 'findflight']/table/tbody/tr[4]/td[2]/select"));
		Select sel1 = new Select(Dropdown1);
		List<WebElement> options1 = sel1.getOptions();
		sel.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.name("servClass")).click();
		driver.findElement(By.xpath("//*[@name = 'findFlights']")).click();
		//sel.selectByVisibleText("2");
		//Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@name = 'reserveFlights']")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Nisha");
		driver.findElement(By.name("passLast0")).sendKeys("S");
		driver.findElement(By.name("passFirst1")).sendKeys("N");
		driver.findElement(By.name("passLast1")).sendKeys("Sh");
		driver.findElement(By.name("passFirst2")).sendKeys("Nish");
		driver.findElement(By.name("passLast2")).sendKeys("Ni");
		driver.findElement(By.name("creditnumber")).sendKeys("9876543255");
		
		
		List<WebElement> CheckBox = driver.findElements(By.xpath("//*[@name ='ticketLess' and @value = 'checkbox']"));
		
		System.out.println("Checkbox size is" + CheckBox.size());
		
		for(int i=0; i<1; i++)
			{
				CheckBox.get(i).click();
			}
		
		Thread.sleep(3000);
			
		//******** to click on both the checkbox**********
		//for (WebElement e:CheckBox)
			//{
				//e.click();
			//}
		
		driver.findElement(By.name("buyFlights")).click();
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		//driver.findElement(By.linkText("mercurysignoff.php")).click();
		//driver.close();

	}

}
