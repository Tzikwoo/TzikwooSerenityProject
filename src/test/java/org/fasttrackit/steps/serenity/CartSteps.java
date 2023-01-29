package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductPage productPage;
    private SaleResultsPage saleResultsPage;
    private CartPage cartPage;

    @Step//Selecteaza link-ul de sale de pe homepage.
    public void clickOnSaleCategory(){
        homePage.clickOnSaleCategory();
    }
    @Step//O metoda folosita pentru a putea reveni la pagina principala.
    public void clickOnSiteLogoLink(){
        homePage.clickOnSiteLogoLink();
    }
    @Step//Click pe "View Details" al produsului.
    public void clickOnViewDetails(){
        saleResultsPage.clickViewDetailsButton();
    }
    @Step
    public void selectProductSizeColor(){
        productPage.selectColor();
        productPage.selectSize();
    }
    @Step
    public void addToCart(){
        productPage.clickOnAddToCart();
    }
    @Step
    public void verifySuccesfullyAdded(String message){
        cartPage.isAddedMessageDisplayed(message);
    }
    @Step
    public void clickCheckoutButton(){
        cartPage.clickProceedToCheckoutButton();
    }
}
