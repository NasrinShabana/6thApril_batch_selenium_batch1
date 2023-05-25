package com.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New_tours {
static WebDriver driver; 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
	System.out.println("hello selenium how r u ? ");
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
		//driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
		// driver.navigate().forward();
		// driver.navigate().back();
		// driver.navigate().refresh();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("pravin");
		
		// String xpath_last_name= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input";
		String xpath_last_name_rel_xapth= "//form/table/tbody/tr[3]/td[2]/input";
		// driver.findElement(By.xpath(xpath_last_name)).sendKeys("singh");
		driver.findElement(By.xpath(xpath_last_name_rel_xapth)).sendKeys("singh");

		WebElement  cnt = driver.findElement(By.name("country"));
		Select s1= new Select(cnt);
		s1.selectByVisibleText("INDIA");
		Thread.sleep(1000);
		s1.selectByValue("ANGOLA");
		Thread.sleep(1000);
		s1.selectByIndex(10);

		driver.findElement(By.xpath("//input[@src='images/submit.gif']")).click();
		// submit
		// driver.findElement(By.name("submit")).click();
		WebElement text99= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
		       String welcome_meassge= text99.getText();
		      System.out.println("welcome_meassge is ======> "+ welcome_meassge);
		     
		     
		}

	}

