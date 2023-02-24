package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

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
