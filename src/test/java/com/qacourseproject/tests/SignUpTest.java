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


    @DataProvider(name = "login-data-csv")
    public static Object[][] dataProviderCsv() throws IOException, CsvException {
        return CsvReader.readCsvFile("src/test/resources/login-data.csv");
    }

    @Test(dataProvider = "login-data-csv")
    public void executeSignUpTest(String firstName, String lastName, String emailAddress, String password, String phoneNumber, String birthMonth, String birthDay, String birthYear) {

        CookiesPage cookiesPage = new CookiesPage(driver);
        HomePage homePage = cookiesPage.goToHomePage();
        Reporter.log("Successful entry to the home page");

        SignInPage signInPage = homePage.clickSignInButton();
        Reporter.log("Successful entry to the Sign In page");

        SignUpPage signUpPage = signInPage.clickSignUpButton();
        Reporter.log("Successful entry to the Sign Up page");

        signUpPage.fillName(firstName, lastName);
        signUpPage.fillEmail(emailAddress);
        signUpPage.fillPass(password);
        signUpPage.fillPhone(phoneNumber);
        signUpPage.fillDateOfBirth(birthMonth, birthDay, birthYear);
        signUpPage.clickSubmit();

        //how to format code intellij macOS hotkey

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(signUpPage.getEmailValidationMessage(), "This email address is not available for sign up, try something else");
        softAssert.assertEquals(signUpPage.getPasswordValidationMessage(), "Your password isn’t strong enough, try making it longer.");
        softAssert.assertEquals(signUpPage.getPhoneNumberValidationMessage(), "That doesn’t look right, please re-enter your phone number.");
        softAssert.assertEquals(signUpPage.getBirthDateValidationMessage(), "That doesn’t look right, please re-enter your birthday.");

        softAssert.assertAll();


    }


    @AfterTest
    public void TearDown() {
        driver.quit();
    }


}
