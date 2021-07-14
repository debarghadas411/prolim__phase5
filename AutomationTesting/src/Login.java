import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome. ChromeDriver;
public class Login{
public static void main(String [] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver. get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
driver.manage().window().maximize();
Thread.sleep(4080);
//driver.findElement(By.className("nav-action-inner")).click();
//Thread. sleep(4030);
driver.findElement (By.id("ap_email")).sendKeys("debarghadas411@gmail.com");
Thread. sleep( 2032);
driver.findElement(By.id("continue")).click();
Thread. sleep(4030);
driver.findElement (By.id("ap_password")).sendKeys("Debargha@123");
Thread. sleep( 1220);
driver.findElement(By.id("signInSubmit")).click();
Thread. sleep( 3030);
driver.findElement (By.id("twotabsearchtextbox")).sendKeys("pen drive");
Thread. sleep( 2220);
driver.findElement(By.id("nav-search-submit-button")).click();
Thread. sleep( 1220);
driver.findElement(By.linkText("16 GB")).click();
Thread. sleep( 2220);
driver.navigate().back();
String al = driver. getTitle( );
System. out.println(al);
}
}