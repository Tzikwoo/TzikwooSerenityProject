package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.WishlistPage;

public class WishlistSteps extends ScenarioSteps {
    private ProductPage productPage;
    private WishlistPage wishlistPage;

    @Step
    public void clickOnWishlistLink(){
        productPage.clickWishlistLink();
    }
    @Step
    public void isSuccesfullyAdded(String message){
        wishlistPage.isAddedToWishlistMessage(message);
    }

}
