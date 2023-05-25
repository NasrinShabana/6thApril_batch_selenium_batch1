package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webpage_demo {
	static WebDriver driver;
	@BeforeTest
public void login_page() throws Exception{
	
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MOSHABAN\\\\eclipse-workspace\\\\Selenium\\\\src\\\\driver\\\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Log in")).click();
Thread.sleep(2000);
driver.findElement(By.name("Email")).sendKeys("shabanamohammed571@gmail.com");
driver.findElement(By.className("password")).sendKeys("Nasrin571_");
//Thread.sleep(4000);
driver.findElement(By.name("RememberMe")).click();
//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

}
@Test(priority = 1)
	public void search_order() throws Exception{
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Computing and Internet");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.id("add-to-cart-button-13")).click();
		
	}
@Test(priority=2)
public void shopping_cart()throws Exception{
	driver.findElement(By.className("cart-label")).click();
	WebElement cnt=driver.findElement(By.name("CountryId"));
	Select s1=new Select(cnt);
	s1.selectByVisibleText("India");
	driver.findElement(By.id("ZipPostalCode")).sendKeys("520004");
	driver.findElement(By.name("estimateshipping")).click();
	driver.findElement(By.id("termsofservice")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("checkout")).click();
}
@Test(priority = 3)
public void billing_address()throws Exception{
	Thread.sleep(2000);
	
	WebElement select_address=driver.findElement(By.id("billing-address-select"));
	Select s2=new Select(select_address);
	s2.selectByVisibleText("New Address");
	Thread.sleep(2000);
	WebElement country=driver.findElement(By.id("BillingNewAddress_CountryId"));
	Select s3=new Select(country);
	s3.selectByVisibleText("India");
	driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Hyderabad");
	driver.findElement(By.name("BillingNewAddress.Address1")).sendKeys("44/2 B jubilee hills");
	driver.findElement(By.name("BillingNewAddress.ZipPostalCode")).sendKeys("520004");
	Thread.sleep(2000);
	driver.findElement(By.name("BillingNewAddress.PhoneNumber")).sendKeys("8765432190");
	driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
	
}
@Test(priority=4)
public void shipping_address() throws Exception{
	driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
}
@Test(priority=5)
public void shipping_method()throws Exception{
	//driver.findElement(By.xpath("//*[@id=\"shippingoption_1\"]")).click();
	
	driver.findElement(By.cssSelector("input[value='Next Day Air___Shipping.FixedRate']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
	
}
@Test(priority=5)
public void payment_method() throws Exception{
	driver.findElement(By.name("paymentmethod")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
}
@Test(priority=6)
public void payment_information() throws Exception{
	driver.findElement(By.cssSelector("input[value='Continue'")).click();
}

}

