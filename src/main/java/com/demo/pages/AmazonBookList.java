package com.demo.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demo.core.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class AmazonBookList extends PageTools {

    By productCard = new By.ByXPath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");

    By productTitle = new By.ByXPath("//span[@id='productTitle']");
    ElementsCollection listOfProducts = getSelenideElements(productCard);
    int size = listOfProducts.size();

    public void checkEveryProductStats(){

        for (int i = 1; i <= size; i++) {
            By everyNextProductLink = new By.ByXPath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])"+"["+i+"]");

            waitForElementPresent(productCard);
            scrollToElement(everyNextProductLink);
            waitForElementPresent(everyNextProductLink);
            click(everyNextProductLink);
            waitForElementPresent(productTitle);
            back();
            System.out.println(size);
        }

    }
}
