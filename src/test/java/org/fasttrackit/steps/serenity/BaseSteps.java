package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;

public class BaseSteps extends ScenarioSteps {
    protected AccountPage accountPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;
    protected ConfirmationPage confirmationPage;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected RegisterPage registerPage;
    protected SaleResultsPage saleResultsPage;
    protected SearchResultsPage searchResultsPage;
    protected WishlistPage wishlistPage;
}
