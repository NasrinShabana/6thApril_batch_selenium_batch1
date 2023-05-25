package com.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	WebDriver driver;
	ChromeOptions options;
@BeforeTest
//
public void mmt_launch_with_chrome_profile() {
	
	System.out.println("Welcome to the Make My Trip...........");
	String userProfile= "C:\\Users\\MOSHABAN\\AppData\\Local\\Google\\Chrome\\User Data";
	System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
	options = new ChromeOptions();
	options.addArguments("--user-data-dir="+userProfile);
	options.addArguments("--profile-directory=Default");
	options.addArguments("--start-maximized");
	//options.addArguments("--disable-notifications");
     options.addArguments("--disable-popup-blocking");
     options.addArguments("--disable-notifications");
   driver = new ChromeDriver(options);
   driver.get("https://makemytrip.com");
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@Test
public void mmt_login_email_id() throws Exception {

	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).click();
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("username")).isEnabled());
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("pravinsingh918@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("abcdefgh");
	}
}