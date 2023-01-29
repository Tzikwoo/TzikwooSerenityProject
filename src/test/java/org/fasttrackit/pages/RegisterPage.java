package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {
    @FindBy (id = "firstname")
    private WebElementFacade firstnameField;
    @FindBy (id = "lastname")
    private WebElementFacade lastnameField;
    @FindBy (id = "email_address")
    private WebElementFacade emailField;
    @FindBy (id = "password")
    private WebElementFacade passwordField;
    @FindBy (id = "confirmation")
    private WebElementFacade confirmationPasswordField;
    @FindBy (id = "is_subscribed")
    private WebElementFacade subscribedCheckBox;
    @FindBy (css = ".buttons-set span span")
    private WebElementFacade registerButton;

    public void typeFirstname(String firstname){
        typeInto(firstnameField,firstname);
    }
    public void typeLastName(String lastname){
        typeInto(lastnameField,lastname);
    }
    public void typeEmail(String email){
        typeInto(emailField,email);
    }
    public void typePassword(String password){
        typeInto(passwordField,password);
    }
    public void typeConfirmation(String confirmation){
        typeInto(confirmationPasswordField,confirmation);
    }
    public void clickSubscribedCheckbox(){
        clickOn(subscribedCheckBox);
    }
    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

}
