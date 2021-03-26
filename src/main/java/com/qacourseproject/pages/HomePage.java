package com.qacourseproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(id = "yfin-usr-qry")
    private WebElement search;

    @FindBy(xpath = "//span[contains(text()='Sign in')]")
    private WebElement searchButton;

    @FindBy(id = "signin-button")
    private WebElement signInBtn;

    public HomePage (WebDriver driver){
        super(driver);
    }

    public MainStatsPage query(String searchField){
        search.sendKeys(searchField);
        searchButton.click();
        return new MainStatsPage(driver);
    }

    public SignInPage signInPage(){
        signInBtn.click();
        return new SignInPage(driver);
    }
}
