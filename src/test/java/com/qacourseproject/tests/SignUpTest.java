package com.qacourseproject.tests;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.qacourseproject.base.TestUtil;
import com.qacourseproject.pages.CookiesPage;
import com.qacourseproject.pages.HomePage;
import com.qacourseproject.pages.SignInPage;
import com.qacourseproject.pages.SignUpPage;
import com.qacourseproject.utils.CsvReader;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class SignUpTest extends TestUtil {



    @BeforeTest
    public void SetUp(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @DataProvider(name = "login-data-csv")
    public static Object[][] dataProviderCsv() throws IOException, CsvException {
        return CsvReader.readCsvFile("src/test/resources/login-data.csv");
    }

        @Test(dataProvider = "login-data-csv")
    public void executeSignUpTest(String firstName, String lastName, String emailAddress, String password, String phoneNumber, String birthMonth, String birthDay, String birthYear){

        CookiesPage cookiesPage = new CookiesPage(driver);
        HomePage homePage = cookiesPage.goToHomePage();
        Reporter.log("Successful entry to the home page");

        SignInPage signInPage = homePage.clickSignInButton();
        Reporter.log("Successful entry to the Sign In page");

        SignUpPage signUpPage = signInPage.clickSignUpButton();
        Reporter.log("Successful entry to the Sign In page");

          //  SoftAssert softAssert = new SoftAssert();


        }



    @AfterTest
    public void TearDown(){
        driver.quit();
    }


}
