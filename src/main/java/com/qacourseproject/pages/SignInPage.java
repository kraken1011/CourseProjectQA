package com.qacourseproject.pages;

import com.qacourseproject.pages.MainStatsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(id = "createacc")
    private WebElement createAcc;

    public SignInPage (WebDriver driver) {
        super(driver);
    }

    public MainStatsPage query(String searchField){
        createAcc.click();
        return new MainStatsPage(driver);
    }
}
