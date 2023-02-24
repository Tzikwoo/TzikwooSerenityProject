package org.fasttrackit.features.search;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {
    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typeUserPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.verifyWelcomeMessage("Hello, Bogdan Perte!");
    }
    @Test
    public void LoginWithouPasswordTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typeUserPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkPasswordFieldRequired();
    }
}
