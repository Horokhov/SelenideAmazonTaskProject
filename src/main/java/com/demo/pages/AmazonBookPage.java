package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.entities.Book;
import org.openqa.selenium.By;

public class AmazonBookPage extends PageTools{
    By bookTitle = new By.ByXPath("//h1[@id='title'] | //span[@id='productTitle']");
    By bookPrice = new By.ByXPath("//span[@class='a-size-base a-color-secondary' or @class='a-size-base a-color-price a-color-price']");
    //("//span[@class='a-button a-button-selected a-spacing-mini a-button-toggle format']");
    By bookBestsellerStatus = new By.ByXPath("//div[@id='centerCol' or @class='a-fixed-right-grid-col a-col-left'] | //div[@id='aud_center_col']");
    By bookAuthor = new By.ByXPath("//div[@id='bylineInfo']");
    String bestSeller = "Best Seller";

    public Book getBookInfo(){
        waitForElementPresent(bookPrice);
        String name = getElementText(bookTitle);
        String author = getElementText(bookAuthor);
        String price = getElementText(bookPrice);
        boolean status = getElementText(bookBestsellerStatus).contains(bestSeller);
        Book bookInList = new Book(name, author, price, status);
        return bookInList;
    }
}
