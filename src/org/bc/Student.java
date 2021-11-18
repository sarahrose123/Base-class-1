package org.bc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Student {

	public void browzerLaunch(String Url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\joe\\eclipse-workspace\\Launch\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("Url");
	}
	public static void main(String[] args) {
		Student a = new Student();
		a.browzerLaunch("https://www.facebook.com/");
		Student b = new Student();
		b.browzerLaunch("https://www.guru99.com/agile-testing-course.html");
		Student c = new Student();
		c.browzerLaunch("https://www.amazon.in/");
	}
	

	}


