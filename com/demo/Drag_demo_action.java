package com.demo;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetElementSize;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Drag_demo_action {
	WebDriver driver;
	@Test(priority=1,enabled=true)
	public void launch_browser()throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/");
	String title=driver.getTitle();
	System.out.println("Title ==>"+title);
	Thread.sleep(2000);
	
	}

	/*
		//WebElement no_of_frames=driver.findElement(By.tagName("iframe"));
		//int s=GetElementSize(no_of_frames);
		int number_of_frames= driver.findElements(By.tagName("iframe")).size();
		System.out.println("=====number_of_frames in jquery =====> " + number_of_frames);
		WebDriverWait wait=new WebDriverWait(driver,5);
	     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//*[@class='demo-frame']"));
	     ////*[@id="draggable"]/p
	     ////*[@id="content"]/iframe
	
	}*/
@Test(priority=2,enabled=true)
public void drag_and_drop() throws Exception{
	int number_of_frames= driver.findElements(By.tagName("iframe")).size();
	System.out.println("=====number_of_frames in jquery =====> " + number_of_frames);
	//driver.switchTo().frame(0);
	WebDriverWait wait = new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"content\"]/iframe")));
////*[@class='demo-frame']
	WebElement source= driver.findElement(By.id("draggable"));
	WebElement target= driver.findElement(By.id("droppable"));

	Actions act = new Actions(driver);
	String before_drop_message = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
	System.out.println("========before_drop_message=====> " + before_drop_message);
	Assert.assertEquals(before_drop_message, "Drop here");
	System.out.println("same message given by the client before droping the source into target ");
	act.dragAndDrop(source,target).build().perform();
	Thread.sleep(2000);

	String after_drop_message = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
	System.out.println("=========after_drop_message=====> " + after_drop_message);
	Assert.assertEquals(after_drop_message,"Dropped!");
	System.out.println("same message given by the client after dropping the src into target");
}

}