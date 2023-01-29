package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends PageObject {
    @FindBy (css = "div h1")
    private WebElementFacade confirmationMessage;

    public void isConfirmationMessageDisplayed(String message){
        confirmationMessage.shouldContainOnlyText(message);
    }
}
