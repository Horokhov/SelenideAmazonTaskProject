package com.demo.login;

import com.demo.core.base.BaseTest;
import com.demo.core.utils.SelenideTools;
import com.demo.entities.Book;
import com.demo.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComparingAGivenBookWithTheFirstPageBooksInAmazon extends BaseTest {

    @Test(testName = "Verifying that certain book is existing on the first page of Amazon search with 'Books' filter")
    public void bookInTheListVerification(){
        SelenideTools.openUrl("https://www.amazon.com/");
        Pages.getAmazonHomePage().chooseFilterOption("Books");
        Pages.getAmazonHomePage().searchForItem("Java");

        List<Book> bookList = Pages.getAmazonBooksActions().collectEachBookInTheList();

        Book givenBook = Pages.getAmazonBooksActions().getGivenBookInfo("https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/ref=sr_1_2?dchild=1&keywords=Java&qid=1610356790&s=books&sr=1-2");
        Assert.assertTrue(bookList.contains(givenBook), "Your book with name"+givenBook.getProductName()+"was not found in Amazon list");
    }
}
