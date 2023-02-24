package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToRegisterPage(){
        homePage.clickOnAccountButton();
        homePage.clickOnRegisterLink();
    }
    @Step
    public void typeFirstname(String firstname){
        registerPage.typeFirstname(firstname);
    }
    @Step
    public void typeLastname(String lastname){
        registerPage.typeLastName(lastname);
    }
    @Step
    public void typeEmail(String email){
        registerPage.typeEmail(email);
    }
    @Step
    public void typePassword(String password){
        registerPage.typePassword(password);
    }
    @Step
    public void typeConfirmation(String confirmation){
        registerPage.typeConfirmation(confirmation);
    }
    @Step
    public void clickSubscribedCheckBox(){
        registerPage.clickSubscribedCheckbox();
    }
    @Step
    public void clickRegister(){
        registerPage.clickOnRegisterButton();
    }
    @Step
    public void verifyRegisterMessage(String registerWelcomeText){
        accountPage.isRegisterWelcomeText(registerWelcomeText);
    }
    @Step
    public void doRegisterNewUser(String firstname, String lastname, String email, String password, String confirmation){
        registerPage.typeFirstname(firstname);
        registerPage.typeLastName(lastname);
        registerPage.typeEmail(email);
        registerPage.typePassword(password);
        registerPage.typeConfirmation(confirmation);
        registerPage.clickSubscribedCheckbox();
        registerPage.clickOnRegisterButton();
    }
}
