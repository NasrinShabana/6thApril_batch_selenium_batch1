package CrossBrowsing;

//public class  {
//
//}

//public class CrossBrowserTestingScript {
//
//}
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class CrossBrowserTesting {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
//	if(browser.equalsIgnoreCase("firefox")){
//
//		System.setProperty("webdriver.gecko.driver","C:\\driver\\geckodriver.exe");
//		 driver = new FirefoxDriver();
//	}
	 if(browser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")){
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\msedgedriver.exe");

		 driver = new EdgeDriver();
	}
	else{

	throw new Exception("Incorrect Browser");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testParameterWithXML() throws InterruptedException{

		driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement sign_in_button=driver.findElement(By.name("proceed"));
		sign_in_button.click();
		Alert al= driver.switchTo().alert();
		String str=al.getText();
		System.out.println(str);
		Assert.assertEquals(str, "Please enter a valid user name");
		System.out.println("alert text validated ");
		Thread.sleep(3000);
		al.accept();
		//al.dismiss();
		//driver.close();
	}
	}