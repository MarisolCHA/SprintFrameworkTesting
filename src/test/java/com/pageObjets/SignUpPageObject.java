package com.pageObjets;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpPageObject  extends PageBase {


    @Autowired
    public SignUpPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement genderFemale;

    @FindBy(id = "countries")
    private WebElement country;

    @FindBy(id = "yearbox")
    private WebElement dateOfBirthYear;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement dateOfBirthMonth;

    @FindBy(id = "daybox")
    private WebElement dateOfBirthDay;

    @FindBy(id = "firstpassword")
    private WebElement password;

    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;

    @FindBy(id = "submitbtn")
    private WebElement submit;

    public WebElement getFirstNameTextbox() {
        return firstNameTextbox;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    public WebElement getPhone() {
        return  phone;
    }

    public WebElement getGenderMale() {
        return genderMale;
    }

    public WebElement getGenderFemale() {
        return genderFemale;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public WebElement getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public WebElement getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getSubmit() {
        return submit;
    }
}
