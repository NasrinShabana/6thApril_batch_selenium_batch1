package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_Selenium_page {
	static WebDriver driver;
	@BeforeTest
	public void launch_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MOSHABAN\\\\eclipse-workspace\\\\Selenium\\\\src\\\\driver\\\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
	}
	@Test(priority=1)
	public void open_link() throws Exception{
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	Thread.sleep(2000);	
	
	driver.switchTo().frame("classFrame");
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	String s1=driver.findElement(By.className("title")).getText();
	System.out.println(s1);
	
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("Alert")).click();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("classFrame");
	String s2=driver.findElement(By.className("title")).getText();
	System.out.println(s2);
	//Interface Alert
	
	
	
}
}

