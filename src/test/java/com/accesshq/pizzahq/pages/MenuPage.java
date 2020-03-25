package com.accesshq.pizzahq.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accesshq.pizzahq.ui.MealCard;

public class MenuPage extends BasePage {

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	public void clickSidesTab() throws Exception {
		this.driver.findElement(By.partialLinkText("SIDES")).click();
		
		
	}

	public MealCard getNewSidesMeal() throws Exception {
		return new MealCard(this.driver.findElement(By.cssSelector(".menuItem.side.new")));
	}		

}
