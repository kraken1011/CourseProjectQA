package com.qacourseproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CookiesPage  extends BasePage{

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement acceptBtn;

    public CookiesPage (WebDriver driver){
        super(driver);
    }

    public HomePage goToHomePage() {
        acceptBtn.click();
        return new HomePage(driver);
    }
}
