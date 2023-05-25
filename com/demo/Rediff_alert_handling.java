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


public class Rediff_alert_handling {
	WebDriver driver ;
	Alert al;
	@BeforeTest
	public void launch_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\MOSHABAN\\\\eclipse-workspace\\\\Selenium\\\\src\\\\driver\\\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	String title_rediff= driver.getTitle();
	System.out.println(title_rediff);
	Assert.assertEquals("Rediffmail", title_rediff);
	System.out.println("rediff same title ");



	}


	@AfterTest
	public void close_browser() {
	driver.close();

	}

	@Test(priority=1,enabled=false)
	public void rediff_username_alert_handling() {
	WebElement login_button = driver.findElement(By.name("proceed"));
	login_button.click();

	al = driver.switchTo().alert();
	String actual_alert_message_username= al.getText();
	System.out.println(actual_alert_message_username);
	String expected_alert_text="Please enter a valid user name";
	Assert.assertEquals(actual_alert_message_username, expected_alert_text);

	System.out.println("====same alert message appeared for username field =====  ");
	al.accept();//ok button
	//al.dismiss();//cancel

	}
	@Test(priority=2,enabled=true)
	public void rediff_password_alert_handling() {
	driver.findElement(By.name("login")).sendKeys("sundar");
	WebElement login_button = driver.findElement(By.name("proceed"));
	login_button.click();
	al = driver.switchTo().alert();
	String actual_alert_message_password= al.getText();
	System.out.println(actual_alert_message_password);
	String expected_alert_text_password="Please enter your password";
	Assert.assertEquals(actual_alert_message_password, expected_alert_text_password);

	System.out.println("====same alert message appeared for password field =====  ");
	al.accept();//ok button
	//al.dismiss();//cancel


	}

	@Test(priority=3)
	public void rediff_invalid_credentials() throws Exception {
	driver.findElement(By.name("login")).clear();
	driver.findElement(By.name("login")).sendKeys("afreen");
	driver.findElement(By.name("passwd")).sendKeys("afreen");
	WebElement login_button = driver.findElement(By.name("proceed"));
	login_button.click();
	Thread.sleep(2000);
	String error_message_after_enering_wrong_credentials = driver.findElement(By.xpath("//*[@id='div_login_error']/b")).getText();
	System.out.println(error_message_after_enering_wrong_credentials);
	Assert.assertEquals(error_message_after_enering_wrong_credentials, "Wrong username and password combination.");
	System.out.println(" ======we got the same error message given by the client ========");


	}

	}

