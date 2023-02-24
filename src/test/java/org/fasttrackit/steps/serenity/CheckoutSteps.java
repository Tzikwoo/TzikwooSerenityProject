package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.ConfirmationPage;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void selectNewShippingAddress(){
        checkoutPage.selectNewShippingAddress();
    }
    @Step
    public void typeStreet(String street){
        checkoutPage.typeStreet(street);
    }
    @Step
    public void typeCity(String city){
        checkoutPage.typeCity(city);
    }
    @Step
    public void selectCountry(String country){
        checkoutPage.selectCountry(country);
    }
    @Step
    public void selectProvince (String province){
        checkoutPage.selectProvince(province);
    }
    @Step
    public void typePostalCode(String postal){
        checkoutPage.typePostalCode((postal));
    }
    @Step
    public void typeTelephone(String telephone){
        checkoutPage.typeTelephone(telephone);
    }
    @Step
    public void clickContinue(){
        checkoutPage.clickContinueButton();
    }
    @Step
    public void selectShipping(){
        checkoutPage.chooseShipping();
    }
    @Step
    public void clickContinue2(){
        checkoutPage.clickContinue2();
    }
    @Step
    public void clickContinue3(){
        checkoutPage.clickContinue3();
    }
    @Step
    public void clickPlaceOrder(){
        checkoutPage.clickPlaceOrder();
    }
    @Step
    public void isConfirmationMessageDisplayed(String message){
        confirmationPage.isConfirmationMessageDisplayed(message);
    }
}
