package com.demo.actions;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.demo.core.base.BaseActions;
import com.demo.core.base.PageTools;
import com.demo.core.utils.SelenideTools;
import com.demo.entities.Book;
import com.demo.pages.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.switchTo;

public class AmazonBooksActions extends BaseActions{
    List<Book> bookList = new ArrayList<>();
    public List<Book> collectEachBookInTheList(){
        for (int i = 1; i <= Pages.getAmazonBookList().getSize(); i++) {
            By eachNextBookLink = Pages.getAmazonBookList().setEveryNextProductLink(new By.ByXPath("(//a[@class='a-link-normal s-no-outline' or class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])"+"["+i+"]"));
            Book book = Pages.getAmazonBookList().checkEveryProductStats(eachNextBookLink);
            bookList.add(book);
        }
        return bookList;
    }

    public Book getGivenBookInfo(String url){
        SelenideTools.openUrlInNewWindow(url);
        switchTo().window(1);
        wait(5);
        Book givenBook = Pages.getAmazonBookPage().getBookInfo();
        return givenBook;
    }
}
