package com.demo.pages;

public class Pages {
    private static VisitPage visitPage;
    private static RegistrationPage registrationPage;
    private static LoginPage loginPage;
    private static CreateRegisterPage createRegisterPage;
    private static AssetPage assetPage;
    private static EmailPage emailPage;
    private static AmazonHomePage amazonHomePage;
    private static AmazonBookPage amazonBookPage;
    private static AmazonBookList amazonBookList;

    public static VisitPage visitPage() {
        if (visitPage == null) {
            visitPage = new VisitPage();
        }
        return visitPage;
    }

    public static RegistrationPage registrationPage() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public static CreateRegisterPage createRegisterPage() {
        if (createRegisterPage == null) {
            createRegisterPage = new CreateRegisterPage();
        }
        return createRegisterPage;
    }

    public static AssetPage assetPage() {
        if (assetPage == null) {
            assetPage = new AssetPage();
        }
        return assetPage;
    }

    public static EmailPage emailPage() {
        if (emailPage == null) {
            emailPage = new EmailPage();
        }
        return emailPage;
    }
    public static AmazonHomePage getAmazonHomePage() {
        if(amazonHomePage == null){
            amazonHomePage = new AmazonHomePage();
        }
        return amazonHomePage;
    }
    public static AmazonBookPage getAmazonBookPage() {
        if(amazonBookPage == null){
            amazonBookPage = new AmazonBookPage();
        }
        return amazonBookPage;
    }
    public static AmazonBookList getAmazonBookList() {
        if(amazonBookList == null){
            amazonBookList = new AmazonBookList();
        }
        return amazonBookList;
    }
}
