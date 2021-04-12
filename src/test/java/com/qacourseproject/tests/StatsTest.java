package com.qacourseproject.tests;

import com.opencsv.exceptions.CsvException;
import com.qacourseproject.base.TestUtil;
import com.qacourseproject.pages.CookiesPage;
import com.qacourseproject.pages.HomePage;
import com.qacourseproject.pages.MainStatsPage;
import com.qacourseproject.pages.StatisticsPage;
import com.qacourseproject.utils.CsvReader;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class StatsTest extends TestUtil {

    @DataProvider(name = "companies-data-csv")
    public static Object[][] dataProviderCsv() throws IOException, CsvException {
        return CsvReader.readCsvFile("src/test/resources/companies-data.csv");
    }

    @Test(dataProvider = "companies-data-csv")
    public void executeStatsTest(String searchField, String dividendsVal, String priceMrqVal) {
        CookiesPage cookiesPage = new CookiesPage(driver);
        HomePage homePage = cookiesPage.goToHomePage();
        Reporter.log("Successful entry to the home page");

        MainStatsPage mainStatsPage = homePage.searchCompany(searchField);
        Reporter.log("Successful entry to the main statistics page");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainStatsPage.getDividendsValue(), dividendsVal);

        StatisticsPage statisticsPage = mainStatsPage.viewStats();
        Reporter.log("Successful entry to the statistics page");

        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals(statisticsPage.getPriceBookValue(), priceMrqVal);


    }
}
