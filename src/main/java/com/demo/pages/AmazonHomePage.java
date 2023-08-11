package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage extends PageTools {
        private By filterOptions = new By.ByXPath("//select[@id='searchDropdownBox']");
        private By searchBox = new By.ById("twotabsearchtextbox");
        private By searchButton = new By.ById("nav-search-submit-button");

        public void chooseFilterOption(String filterName){
                selectOption(filterName,filterOptions);
        }

        public void searchForItem(String searchName){
                type(searchName, searchBox);
                click(searchButton);
        }
}
