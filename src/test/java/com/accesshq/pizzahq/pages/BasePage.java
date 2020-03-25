package com.accesshq.pizzahq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ContactPage clickContactMenuItem() {
		this.driver.findElement(By.cssSelector(".v-toolbar__content [aria-label='contact']")).click();
		return new ContactPage(driver);
	}
	
	public MenuPage clickMenuMenuItem() {
		this.driver.findElement(By.cssSelector(".v-toolbar__content [aria-label='menu']")).click();
		return new MenuPage(driver);
	}
	
}
