package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru_flight {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("hello selenium");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver(); 
				driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
		//driver.findElement(By.name("submit")).click()
				driver.findElement(By.linkText("Flights")).click();
			//WebElement radio1=driver.findElement(By.cssSelector("input[value='tripType']"));
			//radio1.click();
				//Thread.sleep(2000);
				WebElement radio2=driver.findElement(By.cssSelector("input[value='oneway']"));
				radio2.click();
				WebElement passengers=driver.findElement(By.name("passCount"));
				Select s1=new Select(passengers);
				s1.selectByVisibleText("2");
				WebElement Departing_from=driver.findElement(By.name("fromPort"));
				Select s2=new Select(Departing_from);
				s2.selectByVisibleText("London");
				WebElement on=driver.findElement(By.name("fromMonth"));
				Select s3=new Select(on);
				s3.selectByValue("5");
				WebElement onfrom=driver.findElement(By.name("fromDay"));
				Select s4=new Select(onfrom);
				s4.selectByValue("24");
				WebElement Arriving=driver.findElement(By.name("toPort"));
				Select s5=new Select(Arriving);
				s5.selectByIndex(3);
				WebElement returning=driver.findElement(By.name("toMonth"));
				Select s6=new Select(returning);
				s6.selectByVisibleText("May");
				WebElement returning_on=driver.findElement(By.name("toDay"));
				Select s7=new Select(returning_on);
				s7.selectByValue("28");
	WebElement radio3=driver.findElement(By.cssSelector("input[value='Business']"));
				radio3.click();
				WebElement Airline=driver.findElement(By.name("airline"));
				Select s8=new Select(Airline);
				s8.selectByIndex(2);
				driver.findElement(By.name("findFlights")).click();
				
	}

}
