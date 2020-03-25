package com.accesshq.pizzahq.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.accesshq.pizzahq.pages.HomePage;
import com.accesshq.pizzahq.pages.MenuPage;
import com.accesshq.pizzahq.ui.MealCard;

class MenuPageTests extends BaseTestSuite {

	@Test
	void testNewSideDish() throws Exception {
		HomePage homePage = new HomePage(driver);
		MenuPage menuPage = homePage.clickMenuMenuItem();
		menuPage.clickSidesTab();
		
		MealCard mealCard = menuPage.getNewSidesMeal();
		
		Assertions.assertEquals("Korean Sticky Wings",mealCard.getTitle(),"Validate the title of the new meal is correct.");
		Assertions.assertEquals("Korean Sticky Wings",mealCard.getImageAlt(),"Validate the alt attribute for the image is correct.");
		
	}

}
