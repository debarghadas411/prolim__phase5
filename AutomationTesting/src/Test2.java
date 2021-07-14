

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("watches");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='293']")).click();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.partialLinkText("Sony")).click();

	}

}
