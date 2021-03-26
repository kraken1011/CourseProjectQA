package com.qacourseproject.tests;

import com.qacourseproject.base.TestUtil;
import com.qacourseproject.pages.CookiesPage;
import com.qacourseproject.pages.HomePage;
import com.qacourseproject.pages.SignInPage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignUpTest extends TestUtil {

    @Test
    public void executeSignUpTest(){

        CookiesPage cookiesPage = new CookiesPage(driver);
        HomePage homePage = cookiesPage.homePage();
        Reporter.log("Successful entry to the home page");

        HomePage homePage1 = new HomePage(driver);
        SignInPage signInPage = homePage.signInPage();
    }

}
