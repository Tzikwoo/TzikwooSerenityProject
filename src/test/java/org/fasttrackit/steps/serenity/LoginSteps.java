package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnLoginLink();
    }
    @Step
    public void typeUserEmail (String email){
        loginPage.setEmailField(email);
    }
    @Step
    public void typeUserPassword (String password){
        loginPage.setPasswordField(password);
    }
    @Step
    public void clickLogin(){
        loginPage.clickOnLoginButton();
    }
    @Step
    public void verifyWelcomeMessage(String message){
        accountPage.isWelcomeText(message);
    }
    @Step
    public void doLogin(String email, String password){
        navigateToLoginPage();
        typeUserEmail(email);
        typeUserPassword(password);
        clickLogin();
    }
}
