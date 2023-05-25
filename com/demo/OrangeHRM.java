package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class OrangeHRM {
	static WebDriver driver;
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello ORANGEHRM");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		/*WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
         driver.findElement(By.name("submit")).click();*/
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	     user.sendKeys("Admin");
	    WebElement passwd= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	    passwd.sendKeys("admin123");
	    Thread.sleep(2000);
	    WebElement button1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        button1.click();
        Thread.sleep(2000);
        WebElement pim=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        pim.click();
	     
	}

}
