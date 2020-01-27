package com.academy.dev.automationpractice.page;

import com.academy.dev.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[1]/h3[text()='My address']")
    private WebElement myAddressLabelText;

    public MyAddressPage(WebDriver driver) {
        super(driver);
    }

    public String getContainerText() {
        return myAddressLabelText.getText().trim();
    }
}
