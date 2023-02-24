package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.TestsRequirement;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest{
    @Test
    public void searchForSpecificItemTest(){
        searchSteps.navigateToHomepage();
        searchSteps.searchAndClick("SHIRT");
        searchSteps.isProductInlist("CORE STRIPED SPORT SHIRT");
    }
}
