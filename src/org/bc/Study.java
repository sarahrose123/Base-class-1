package org.bc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study {

		WebDriver driver;//instance
		public void browsLau(String url) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\joe\\eclipse-workspace\\Launch\\Driver\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get(url);
		}
		public WebElement locatorById(String value) {
			WebElement findElement = driver.findElement(By.id(value));
			return findElement;	
		}
		public WebElement locatorByName(String value) {
			WebElement findElement = driver.findElement(By.name(value));
			return findElement;
        }
		public WebElement locatorByXpath(String value) {
			WebElement findElement = driver.findElement(By.xpath(value));
			return findElement;
		}
		

}
