package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest{
    @Ignore
    @Test
    public void checkoutWithLoginTest(){
        loginSteps.doLogin("bogdi_perte98@yahoo.com","300798");
        cartSteps.clickOnSiteLogoLink();
        cartSteps.clickOnSaleCategory();
        cartSteps.clickOnViewDetails();
        cartSteps.selectProductSizeColor();
        cartSteps.addToCart();
        cartSteps.clickCheckoutButton();
        checkoutSteps.selectNewShippingAddress();
        checkoutSteps.typeStreet("25 Grigore Alexandrescu Street");
        checkoutSteps.typeCity("Cluj-Napoca");
        checkoutSteps.selectCountry("România");
        checkoutSteps.selectProvince("Cluj");
        checkoutSteps.typePostalCode("400529");
        checkoutSteps.typeTelephone("0742942953");
        checkoutSteps.clickContinue();
        checkoutSteps.selectShipping();
        checkoutSteps.clickContinue2();
        checkoutSteps.clickContinue3();
        checkoutSteps.clickPlaceOrder();
        checkoutSteps.isConfirmationMessageDisplayed("YOUR ORDER HAS BEEN RECEIVED.");
    }
}
