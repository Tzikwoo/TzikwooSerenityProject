package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.steps.serenity.WishlistSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WishlistTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Before
    public void maximize(){
        driver.manage().window().maximize();
    }
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private WishlistSteps wishlistSteps;

    @Test
    public void addToWishlistWithLoginTest (){
        loginSteps.doLogin("bogdi_perte98@yahoo.com","300798");
        searchSteps.searchAndClick("SHIRT");
        searchSteps.clickViewDetails();
        wishlistSteps.clickOnWishlistLink();
        wishlistSteps.isSuccesfullyAdded("SLIM FIT DOBBY OXFORD SHIRT");
    }
}
