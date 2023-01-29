package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {
    @FindBy(css = ".swatch-label img")
    private WebElementFacade colorButton;
    @FindBy (css = "#configurable_swatch_size .swatch-label")
    private WebElementFacade sizeButton;
    @FindBy (css = ".add-to-cart span span")
    private WebElementFacade addToCartButton;
    @FindBy (css = ".link-wishlist")
    private WebElementFacade wishlistLink;

    public void selectColor(){
        clickOn(colorButton);
    }
    public void selectSize(){
        clickOn(sizeButton);
    }
    public void clickOnAddToCart(){
        clickOn(addToCartButton);
    }
    public void clickWishlistLink(){
        clickOn(wishlistLink);
    }
}
