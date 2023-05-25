package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_Handling_hdfc {
	WebDriver driver;
	@BeforeTest
	public void launch_browser() throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get(");
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	String title_hdfc=driver.getTitle();
	System.out.println(title_hdfc);
	Thread.sleep(2000);
	
}
	@Test(priority=1,enabled=true)
	public void frame_handling_hdfc_netbanking() {
		//int Number_of_frames=driver.findElement(By.tagName("frame")).size();
		//System.out.println("==Number of frames in hdfc netbanking===>"+Number_of_frames);
		//driver.To().frame(0);
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("login_page")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
		driver.switchTo().defaultContent();
		boolean isdisplayed_privacy_link=driver.findElement(By.linkText("Privacy Policy")).isDisplayed();
		System.out.println(isdisplayed_privacy_link);
		boolean isenabled_privacy_link=driver.findElement(By.linkText("Privacy Policy")).isDisplayed();
		System.out.println(isenabled_privacy_link);
		driver.findElement(By.linkText("Privacy Policy")).click();
		String page_title=driver.getTitle();
		System.out.println(page_title);		
	}
	@AfterTest
	public void close_browser() {
		driver.close();
		driver.quit();
	}
	
}
