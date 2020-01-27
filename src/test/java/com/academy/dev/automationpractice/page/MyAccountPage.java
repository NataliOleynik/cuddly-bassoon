package com.academy.dev.automationpractice.page;

import com.academy.dev.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(css = "a.logout")
    private WebElement signOutButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement viewMyCustomerAccountButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    private WebElement myAddressesButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage availableSignOutButton() {
        signOutButton.isDisplayed();
        return this;
    }

    public AuthenticationPage clickSignOutButton(){
        signOutButton.click();
        return new AuthenticationPage(driver);
    }

    public MyAccountPage availableViewAccountButton() {
        viewMyCustomerAccountButton.isDisplayed();
        return this;
    }

    public MyAddressPage clickMyAddressesButton() {
        myAddressesButton.click();
        return new MyAddressPage(driver);
    }

}
