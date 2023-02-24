package org.fasttrackit.steps.serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {
    @Step
    public void navigateToLoginPage(){
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
    @Step
    public void checkPasswordFieldRequired(){
        Assert.assertEquals("This is a required field.",loginPage.getRequiredPasswordText());
    }
}
