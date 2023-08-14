package com.demo.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.demo.core.base.PageTools;
import com.demo.entities.Book;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AmazonBookList extends PageTools {

    By productCard = new By.ByXPath("//h2[contains(@class,'a-size-mini a-spacing-none a-color-base s-line-clamp')]");
    ElementsCollection listOfProducts = getSelenideElements(productCard);
    By everyNextProductLink = new By.ByXPath("");
    public By setEveryNextProductLink(By everyNextProductLink) {
        this.everyNextProductLink = everyNextProductLink;
        return everyNextProductLink;
    }

    int size = listOfProducts.size();
    List<Book> bookList = new ArrayList<>();
    public int getSize() {
        return size;
    }

    public Book checkEveryProductStats(By everyNextProductLink){
            scrollToElement(everyNextProductLink);
            waitForElementPresent(everyNextProductLink);
            click(everyNextProductLink);
            Book book = Pages.getAmazonBookPage().getBookInfo();
            Selenide.back();
            waitForElementVisibility(everyNextProductLink);
            return book;
    }


}
