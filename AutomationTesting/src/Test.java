

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Debargha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Das");
		driver.findElement(By.name("radiooptions")).click();
		
		Thread.sleep(2000);
driver.findElement(By.id("checkbox1")).click();
		
		Thread.sleep(2000);
driver.findElement(By.id("checkbox3")).click();
		
		Thread.sleep(2000);
		WebElement testDropDown = driver.findElement(By.id("Skills")); 
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByIndex(5);  
		
		WebElement testDropDown2 = driver.findElement(By.id("countries")); 
		Select dropdown2 = new Select(testDropDown2);  
		dropdown2.selectByValue("India"); 
		
		
		
		WebElement testDropDown4 = driver.findElement(By.id("yearbox")); 
		Select dropdown4 = new Select(testDropDown4);  
		dropdown4.selectByValue("1997");
//		WebElement testDropDown3 = driver.findElement(By.xpath("//input[@placeholder='Month']")); 
//		Select dropdown3 = new Select(testDropDown3);  
//		dropdown3.selectByValue("March");  
		driver.findElement(By.id("firstpassword")).sendKeys("Debargha#123");
		driver.findElement(By.id("secondpassword")).sendKeys("Debargha#123");
	}
}