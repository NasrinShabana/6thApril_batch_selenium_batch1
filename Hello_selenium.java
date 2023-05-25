import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_selenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("hello selenium");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
WebDriver drive=new ChromeDriver();
drive.get("https://www.google.com/");
WebElement google_search=drive.findElement(By.name("q"));
google_search.sendKeys("selenium");
Thread.sleep(2000);
WebElement google_search_buttton=drive.findElement(By.name("btnK"));
boolean b1=google_search_buttton.isDisplayed();
System.out.println("is google search button displayed?==> "+b1);
boolean b2=google_search_buttton.isEnabled();
System.out.println("is google search button is enabled?=>"+b2);
google_search_buttton.click();
String page_url_current=drive.getCurrentUrl();
System.out.println("current url=>"+page_url_current);
drive.close();
drive.quit();
}
	}

