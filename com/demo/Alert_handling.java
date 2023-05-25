package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert_handling {
	WebDriver driver ;
	Alert al;
@BeforeTest
public void launchh_browser() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MOSHABAN\\\\eclipse-workspace\\\\Selenium\\\\src\\\\driver\\\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	String title_rediff= driver.getTitle();
	System.out.println(title_rediff);
}
@Test(priority=1,enabled = false)
public void valid_username() {
	WebElement login=driver.findElement(By.name("proceed"));
			login.click();
			Alert al=driver.switchTo().alert();
			String alert_msg=al.getText();
			String expected_msg="Please enter a valid user name";
			Assert.assertEquals(alert_msg, expected_msg);
			System.out.println("==same alert message appeared===");
			al.accept();
			//al.dismiss();
	
}
@Test(priority=2,enabled=false)
public void valid_password()throws Exception {
	driver.findElement(By.name("login")).sendKeys("shabanaa");
	WebElement login_bu=driver.findElement(By.name("proceed"));
	login_bu.click();
	
	//Thread.sleep(2000);
	al=driver.switchTo().alert();
	String alert_msg_passwd=al.getText();
	String expected_msg_passwd="Please enter your password";
	Assert.assertEquals(alert_msg_passwd, expected_msg_passwd);
	System.out.println("==same alert message appeared===");
	al.accept();
	//al.dismiss();
}
@Test(priority=3,enabled=true)
public void invalid_credentials() throws Exception{
	driver.findElement(By.name("login")).clear();
	driver.findElement(By.name("login")).sendKeys("shabana");
	driver.findElement(By.name("passwd")).sendKeys("shabana571");
	WebElement login_bu=driver.findElement(By.name("proceed"));

	login_bu.click();
	
	//Thread.sleep(2000);
	al=driver.switchTo().alert();
String text=driver.findElement(By.xpath("//*[@id=\"div_login_error\"]/b")).getText();
Assert.assertEquals(text,"Wrong username and password combination.");
System.out.println("SAME TEXT");
al.accept();
	//al.dismiss();
	
}
@AfterTest
public void close_broswer() {
	driver.close();
	driver.quit();
}
}

