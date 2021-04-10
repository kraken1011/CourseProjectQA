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

    public SignUpPage  (WebDriver driver) {
        super(driver);
    }

    public String getEmailValidationMessage(){
        return email.getText();
    }

    public String getPasswordValidationMessage(){
        return password.getText();
    }

    public String getPhoneNumberValidationMessage(){
        return phoneNumber.getText();
    }

    public String getBirthDateValidationMessage(){
        return dayOfBirth.getText();
    }

    public SignUpPage fillName(){
        firstName.sendKeys();
        lastName.sendKeys();
        return new SignUpPage(driver);
    }

    public SignUpPage fillEmail(){
        email.sendKeys();
        return new SignUpPage(driver);
    }

    public SignUpPage fillPass(){
        password.sendKeys();
        return new SignUpPage(driver);
    }

    public SignUpPage fillPhone(){
        phoneNumber.sendKeys();
        return new SignUpPage(driver);
    }

    public SignUpPage fillDateOfBirth(){
        monthOfBirth.click();
        dayOfBirth.sendKeys();
        yearOfBirth.sendKeys();
        return new SignUpPage(driver);
    }
}
