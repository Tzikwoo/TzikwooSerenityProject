package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {
    @Test
    public void newUserRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.typeFirstname("Laurentiu");
        registerSteps.typeLastname("Petre");
        registerSteps.typeEmail("laupe12@yahoo.com");
        registerSteps.typePassword("123456");
        registerSteps.typeConfirmation("123456");
        registerSteps.clickSubscribedCheckBox();
        registerSteps.clickRegister();
        registerSteps.verifyRegisterMessage("Hello, Laurentiu Petre!");
    }
}
