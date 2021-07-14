import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		int countiFrame=driver.findElements(By.tagName("iframe")).size();
		System.out.println(countiFrame);
		WebElement frame1= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
//		System.out.println(frame1.getText());
		

	}

}
