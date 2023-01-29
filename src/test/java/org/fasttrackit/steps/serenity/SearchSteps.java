package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.eclipse.jetty.util.thread.strategy.ProduceConsume;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private ProductPage productPage;
    @Step
    public void navigateToHomepage(){
    homePage.open();
}
    @Step
    public void searchAndClick(String itemName){
        homePage.searchAndClick(itemName);
    }
    @Step
    public void isProductInlist(String productName){
        Assert.assertTrue(searchResultsPage.isProductInList(productName));
    }
    @Step
    public void clickViewDetails(){
        searchResultsPage.clickViewDetails();
    }
}
