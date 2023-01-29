package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {
    @FindBy(css = "p strong")
    private WebElementFacade welcomeTextElement;
    @FindBy (css = ".hello strong")
    private WebElementFacade registrationWelcomeTextElement ;

    public void isWelcomeText (String welcomeText){
        welcomeTextElement.shouldContainOnlyText(welcomeText);
    }
    public void isRegisterWelcomeText(String registerWelcomeText){
        registrationWelcomeTextElement.shouldContainOnlyText(registerWelcomeText);
    }
}
