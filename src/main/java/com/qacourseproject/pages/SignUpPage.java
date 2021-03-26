package com.qacourseproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(id = "usernamereg-firstName")
    private WebElement firstName;

    @FindBy(id = "usernamereg-lastName")
    private WebElement lastName;

    @FindBy(id = "usernamereg-yid")
    private WebElement email;

    @FindBy(id = "usernamereg-password")
    private WebElement password;

    @FindBy(id = "usernamereg-phone")
    private WebElement phoneNumber;

    @FindBy(id = "usernamereg-month")
    private WebElement monthOfBirth;

    @FindBy(id = "usernamereg-day")
    private WebElement dayOfBirth;

    @FindBy(id = "usernamereg-year")
    private WebElement yearOfBirth;

    public SignUpPage (WebDriver driver) {
        super(driver);
    }
}
