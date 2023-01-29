package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Before
    public void maximize(){
        driver.manage().window().maximize();
    }
}
