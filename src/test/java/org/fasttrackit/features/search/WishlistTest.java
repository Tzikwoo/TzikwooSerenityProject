package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.steps.serenity.WishlistSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WishlistTest extends BaseTest{
    @Test
    public void addToWishlistWithLoginTest (){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        searchSteps.searchAndClick("SHIRT");
        searchSteps.clickViewDetails();
        wishlistSteps.clickOnWishlistLink();
        wishlistSteps.isSuccesfullyAdded("SLIM FIT DOBBY OXFORD SHIRT");
    }
}
