package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_handling {
	WebDriver driver;
	@BeforeTest
	public void launch_browser() throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\MOSHABAN\\\\\\\\eclipse-workspace\\\\\\\\Selenium\\\\\\\\src\\\\\\\\driver\\\\\\\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get(");
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	String title_hdfc=driver.getTitle();
	System.out.println(title_hdfc);
	Thread.sleep(2000);
	
}
	@Test(priority=1)
	public void frame_handling_hdfc() {
		
	}
}
