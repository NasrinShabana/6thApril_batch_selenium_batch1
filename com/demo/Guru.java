package com.demo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Guru {
	static WebDriver driver;

	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		@Test
//public void Registration()throws Exception {
	//	}	
public void launch_browser() {
		System.out.println("hello selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*drive.get("https://demo.guru99.com/selenium/newtours/register.php");
		
		Thread.sleep(2000);*/
		//driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
}
//@Test
//public void close_browser() {
//	driver.close();
//}
//@Test
public void click_on_register()throws Exception {
	Thread.sleep(2000);
	//driver.findElement(By.linkText("REGISTER")).click();	
	WebElement reg=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
			reg.click();
	Thread.sleep(1000);
}
public void registration_details()throws Exception{
		WebElement first_name=driver.findElement(By.name("firstName"));first_name.sendKeys("shabana");
		WebElement last_name=driver.findElement(By.name("lastName"));last_name.sendKeys("nasrin");
		WebElement phone=driver.findElement(By.name("phone"));phone.sendKeys("8019611220");
		WebElement email=driver.findElement(By.name("userName"));email.sendKeys("nasrin@gmail.com");
		WebElement address=driver.findElement(By.name("address1"));address.sendKeys("hitech-city,madhapur");
		WebElement city=driver.findElement(By.name("city"));city.sendKeys("hyderabad");
		WebElement state=driver.findElement(By.name("state"));state.sendKeys("hyderabad");
		WebElement postal_code=driver.findElement(By.name("postalCode"));postal_code.sendKeys("520004");
	     WebElement  cnt = driver.findElement(By.name("country"));
		Select s1= new Select(cnt);
		s1.selectByVisibleText("INDIA");
		Thread.sleep(1000);
		s1.selectByValue("ANGOLA");
		Thread.sleep(1000);
		s1.selectByIndex(10);
		WebElement user_name=driver.findElement(By.name("email"));first_name.sendKeys("shabana");
		WebElement password=driver.findElement(By.name("password"));first_name.sendKeys("shabana571");
		WebElement confirm_password=driver.findElement(By.name("confirmPassword"));first_name.sendKeys("shabana571");
        driver.findElement(By.name("submit")).click();
      
	}

}
//}