package com.academy.dev.automationpractice.page;

import com.academy.dev.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(linkText = "Sign in")
    private WebElement signInButton;

    @FindBy(id="search_query_top")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchButton;

    public HomePage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
    }

    public HomePage goToHomePage () {
        driver.get(baseUrl);
        return this;
    }

    public AuthenticationPage clickSignIn() {
        signInButton.click();
        return new AuthenticationPage(driver);
    }

    // метод-пустышка (добавили для лучшей читабельности кода/красоты, подобие кукумбера)
    public HomePage then() {
        return this;
    }

    public HomePage clickSearchInput() {
        searchInput.click();
        return this;
    }

    public HomePage enterSearchRequest(String requestText) {
        searchInput.sendKeys(requestText);
        return this;
    }

    public SearchResultPage clickSearchButton() {
        searchButton.click();
        return new SearchResultPage(driver);
    }

}
