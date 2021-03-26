package com.qacourseproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatisticsPage extends BasePage {

    @FindBy(xpath = "//*[@id=“Col1-0-KeyStatistics-Proxy\"]/section/div[2]/div[1]/div/div/div/div/table/tbody/tr[7]/td[2]")
    private WebElement priceMrq;

    public StatisticsPage (WebDriver driver) {
        super(driver);
    }
}
