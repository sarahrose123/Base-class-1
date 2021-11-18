package org.bc;

import org.openqa.selenium.WebElement;

public class Company extends Study{

	public static void main(String[] args) {
		Company a = new Company();
		a.browsLau("https://adactinhotelapp.com/");
		WebElement txtUsername = a.locatorById("username");
		txtUsername.sendKeys("Sarah");
		WebElement txtPassword = a.locatorById("password");
		txtPassword.sendKeys("12345");
		

	}

}
