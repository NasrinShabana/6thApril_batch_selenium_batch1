package com.demo;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Make_mytrip {
	static WebDriver driver;
	@Test
public void login()throws Exception{
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\MOSHABAN\\\\eclipse-workspace\\\\Selenium\\\\src\\\\driver\\\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).click();
	//Action a=new Action(driver);
	//a.
	driver.findElement(By.name("username")).sendKeys("8019611220");
}
}
