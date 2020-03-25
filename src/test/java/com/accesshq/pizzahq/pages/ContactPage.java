package com.accesshq.pizzahq.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
	}

	public void setEmail(String email) {
		WebElement emailElement = this.driver.findElement(By.id("email"));
		emailElement.sendKeys(email);
	}

	public void setTelephone(String telephone) {
		WebElement telephoneElement = this.driver.findElement(By.id("telephone"));
		telephoneElement.sendKeys(telephone);
	}

	public void clickSubmit() {
		this.driver.findElement(By.cssSelector("[aria-label='submit']")).click();
	}

	public String getEmailErrorText() {
		List<WebElement> elemList = this.driver.findElements(By.id("email-err"));

		return elemList.size() > 0 ? elemList.get(0).getText() : "";
	}

	public String getTelephoneErrorText() {
		List<WebElement> elemList = this.driver.findElements(By.id("telephone-err"));

		return elemList.size() > 0 ? elemList.get(0).getText() : "";
	}

	public void clickClear() {
		this.driver.findElement(By.cssSelector("[aria-label='clear']")).click();
	}

}
