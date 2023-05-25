package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOSHABAN\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://chromedriver.storage.googleapis.com/index.html?path=112.0.5615.49/");
	}

}
