package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {
    @FindBy (id = "billing-address-select")
    private WebElementFacade newShippingAddressDropdown;
    @FindBy (id = "billing:street1")
    private WebElementFacade addressField;
    @FindBy (id = "billing:city")
    private WebElementFacade cityField;
    @FindBy (id = "billing:country_id")
    private WebElementFacade countryDropdown;
    @FindBy (id = "billing:region_id")
    private WebElementFacade provinceDropdown;
    @FindBy (id = "billing:postcode")
    private WebElementFacade postalCodeField;
    @FindBy (id = "billing:telephone")
    private WebElementFacade telephoneField;
    @FindBy (css = ".buttons-set span span")
    private WebElementFacade continueButton;
    @FindBy (id = "s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingRadioButton;
    @FindBy (css = "#shipping-method-buttons-container button")
    private WebElementFacade continue2Button;
    @FindBy (css = "#payment-buttons-container span span")
    private WebElementFacade continue3Button;
    @FindBy(css = "#review-buttons-container button")
    private WebElementFacade placeOrderButton;

    public void selectNewShippingAddress(){
        selectFromDropdown(newShippingAddressDropdown,"New Address");
    }
    public void typeStreet(String street){
        typeInto(addressField,street);
    }
    public void typeCity(String city){
        typeInto(cityField,city);
    }
    public void selectCountry(String country){
        selectFromDropdown(countryDropdown,country);
    }
    public void selectProvince(String province){
        selectFromDropdown(provinceDropdown,province);
    }
    public void typePostalCode(String postal){
        typeInto(postalCodeField,postal);
    }
    public void typeTelephone(String telephone){
        typeInto(telephoneField, telephone);
    }
    public void clickContinueButton(){
        clickOn(continueButton);
    }
    public void chooseShipping(){
        clickOn(freeShippingRadioButton);
    }
    public void clickContinue2(){
        clickOn(continue2Button);
    }
    public void clickContinue3(){
        clickOn(continue3Button);
    }
    public void clickPlaceOrder(){
        clickOn(placeOrderButton);
    }
}
