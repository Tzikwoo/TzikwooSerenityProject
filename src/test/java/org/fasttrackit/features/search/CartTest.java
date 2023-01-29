package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Before
    public void maximize(){
        driver.manage().window().maximize();
    }
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CartSteps cartSteps;
    @Test
    public void addToCartTest(){
    loginSteps.doLogin("bogdi_perte98@yahoo.com","300798");
    cartSteps.clickOnSiteLogoLink();
    cartSteps.clickOnSaleCategory();
    cartSteps.clickOnViewDetails();
    cartSteps.selectProductSizeColor();
    cartSteps.addToCart();
    cartSteps.verifySuccesfullyAdded("Slim fit Dobby Oxford Shirt was added to your shopping cart.");
    }
}
