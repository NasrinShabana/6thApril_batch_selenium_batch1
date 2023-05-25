package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Create Account")).click();
		WebElement full_name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		full_name.sendKeys("shabana mohammed");
		WebElement id=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		id.sendKeys("shabbu_571");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
	WebElement password=driver.findElement(By.xpath("//*[@id=\"newpasswd\"]"));
	password.sendKeys("shabana_mohammed");
	WebElement re_password=driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]"));
	re_password.sendKeys("shabana_mohammed");
	WebElement alternate_email=driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
	alternate_email.sendKeys("shabana_571");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
	WebElement security_que=driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
	Select s1=new Select(security_que);
	s1.selectByIndex(2);
	driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("vignesh");
	driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("afreen");
	driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("809876543");
	WebElement dob=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s2=new Select(dob);
	s2.selectByValue("24");
	WebElement dob_m=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s3=new Select(dob_m);
	s2.selectByIndex(4);
	WebElement dob_y=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select s4=new Select(dob_y);
	s2.selectByValue("2001");
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();
	WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select c = new Select(country);
	c.selectByIndex(5);
	c.selectByIndex(0);

	
	}

}
