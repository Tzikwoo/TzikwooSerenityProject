package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends PageObject {
    @FindBy(css = ".product-name a")
    private List<WebElementFacade> listOfResults;
    @FindBy(css = ".actions :first-child")
    private WebElementFacade viewItemDetailsButton;

    public boolean isProductInList(String productName){
        for (WebElementFacade element : listOfResults){
            if (element.getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void clickViewDetails(){
        clickOn(viewItemDetailsButton);
    }
}
