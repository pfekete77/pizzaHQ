package com.accesshq.pizzahq.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MealCard {

	private WebElement element;
	
	public MealCard(WebElement element) {
		this.element = element;
	}

	public String getTitle() {
		return this.element.findElement(By.className("name")).getText();
	}

	public String getImageAlt() {
		return this.element.findElement(By.tagName("img")).getAttribute("alt");
	}
	
	

}
