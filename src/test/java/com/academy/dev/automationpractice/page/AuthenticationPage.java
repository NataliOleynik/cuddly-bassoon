package com.academy.dev.automationpractice.page;

import com.academy.dev.core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    private WebElement signInButton;

    @FindBy(css="#center_column > div.alert.alert-danger > ol > li")
    private WebElement errMsgElement;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @Step("fill email {0}")
    public AuthenticationPage fillEmail(String login) {
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys(email);
        fillInput(emailInput, login);
        return this;
    }

    @Step("fill password {0}")
    public AuthenticationPage fillPassword(String password) {
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys(password);
        fillInput(passwordInput, password);
        return this;
    }

    public AuthenticationPage clickSubmitUnsuccessLogin() {
        signInButton.click();
        return this;
    }

    public MyAccountPage clickSubmitSuccessLogin() {
        signInButton.click();
        return new MyAccountPage(driver);
    }

    public String getErrMsg() {
        return errMsgElement.getText().trim();
    }
}
