package com.demo.core.config;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelenideConfig {

    public static void createBrowserConfig(String browser) {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

        Logger.getLogger("org.openqa.selenium").setLevel(Level.ALL);

        Configuration.browser = browser;

        Configuration.startMaximized = true;
        Configuration.fastSetValue = false;
        Configuration.savePageSource = false;
        Configuration.screenshots = true;
        Configuration.pollingInterval = 5000;
        Configuration.pageLoadStrategy = "normal";
        Configuration.timeout = 18000;
    }
}