package com.qacourseproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainStatsPage extends BasePage {

    @FindBy(xpath = "//span[contains(text()=’Statistics’)]")
    private WebElement statisticsBtn;

    @FindBy(css = "[data-test=‘DIVIDENT_AND_YIELD-value’]")
    private WebElement dividendsValue;

    public MainStatsPage (WebDriver driver) {
        super(driver);
    }

    public StatisticsPage viewStats() {
        statisticsBtn.click();
        return new StatisticsPage(driver);
    }
}



