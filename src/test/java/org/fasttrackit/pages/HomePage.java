package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;
    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginlink;
    @FindBy (css = ".level0.nav-5 a")
    private WebElementFacade saleLinkCategory;
    @FindBy(css = ".logo")
    private WebElementFacade siteLogo;
    @FindBy (css = "li [title='Register']")
    private WebElement registerLink;
    @FindBy (id = "search")
    private WebElementFacade searchField;
    @FindBy (css = ".search-button")
    private WebElementFacade searchButton;
    public void clickOnAccountButton (){
        clickOn(accountButton);
    }
    public void clickOnLoginLink (){
        clickOn(loginlink);
    }
    public void clickOnSaleCategory(){
        clickOn(saleLinkCategory);
    }
    public void clickOnSiteLogoLink(){
        clickOn(siteLogo);
    }
    public void clickOnRegisterLink(){
        clickOn(registerLink);
    }
    public void searchAndClick(String itemName){
        typeInto(searchField,itemName);
        clickOn(searchButton);
    }
}
