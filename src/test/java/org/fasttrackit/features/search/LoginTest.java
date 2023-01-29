package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Before
    public void maximize(){
        driver.manage().window().maximize();
    }
    @Steps
    private LoginSteps loginSteps;
    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("bogdi_perte98@yahoo.com");
        loginSteps.typeUserPassword("300798");
        loginSteps.clickLogin();
        loginSteps.verifyWelcomeMessage("Hello, Bogdan Perte!");
    }
}
