package com.demo.login;

import com.demo.core.base.BaseTest;
import com.demo.core.utils.SelenideTools;
import com.demo.pages.Pages;
import org.testng.annotations.Test;

public class ComparingAGivenBookWithTheFirstPageInAmazon extends BaseTest {

    @Test(testName = "Verifying that certain book is existing on the first page of Amazon search with 'Books' filter")
    public void bookInTheListVerification(){
        SelenideTools.openUrl("https://www.amazon.com/");
        Pages.getAmazonHomePage().chooseFilterOption("Books");
        Pages.getAmazonHomePage().searchForItem("Java");

        Pages.getAmazonBookList().checkEveryProductStats();
    }
}
