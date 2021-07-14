import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoID {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__cond-24\"]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]/span")).click();
		Runtime.getRuntime().exec("D:\\auto_test.exe");
		Thread.sleep(5000);
		System.out.println("converted to pdf");
		driver.close();
	}

}
