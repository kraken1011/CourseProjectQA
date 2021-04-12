package com.qacourseproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainStatsPage extends BasePage {

    @FindBy(xpath = "//span[contains(text()=’Statistics’)]")
    private WebElement statisticsBtn;

    @FindBy(xpath = "//td[@data-test='DIVIDEND_AND_YIELD-value']")
    private WebElement dividendsVal;

    public String getDividendsValue(){
        return dividendsVal.getText();
    }

    public MainStatsPage (WebDriver driver) {
        super(driver);
    }

    public StatisticsPage viewStats() {
        statisticsBtn.click();
        return new StatisticsPage(driver);
    }
}



