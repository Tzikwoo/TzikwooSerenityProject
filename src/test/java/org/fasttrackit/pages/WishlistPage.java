package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageObject {
    @FindBy(css = "h3 a")
    private WebElementFacade addedToWishlistMessage;

    public void isAddedToWishlistMessage(String message){
        addedToWishlistMessage.shouldContainOnlyText(message);
    }
}
