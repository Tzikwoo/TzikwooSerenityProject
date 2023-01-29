package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaleResultsPage extends PageObject {
    @FindBy(css = ".actions a.button")
    private WebElementFacade viewDetailsButton;

    public void clickViewDetailsButton(){
        clickOn(viewDetailsButton);
    }
}
