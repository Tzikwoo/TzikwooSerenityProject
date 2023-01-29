package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    @FindBy(css = ".success-msg  span")
    private WebElementFacade successAddedMessage;
    @FindBy(css = ".bottom button")
    private WebElementFacade proceedCheckoutButton;

    public void isAddedMessageDisplayed(String message)//Verifica daca apare mesajul ca produsul a fost adaugat cu succes in cos.
    {
        successAddedMessage.shouldContainOnlyText(message);
    }
    public void clickProceedToCheckoutButton(){
        clickOn(proceedCheckoutButton);
    }
}
