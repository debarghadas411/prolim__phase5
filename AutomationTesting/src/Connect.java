import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome. ChromeDriver;
public class Connect{
public static void main(String [] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver. get("https://www.gmail.com");
driver.manage().window().maximize();
Thread.sleep(4080);
driver.findElement (By.id("identifierId")).sendKeys("debargha19118@iiitd.ac.in");
Thread. sleep( 2032);
driver.findElement(By.className("VfPpkd-vQzf8d")).click();
Thread. sleep(4030);
driver.findElement (By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Debargha@123");
Thread. sleep( 1220);
driver.findElement(By.className("VfPpkd-vQzf8d")).click();
Thread. sleep( 1030);
String al = driver. getTitle( );
System. out.println(al);
}
}