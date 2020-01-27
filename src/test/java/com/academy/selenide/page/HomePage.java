package com.academy.selenide.page;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    @FindBy(partialLinkText = "Subscribers")
    private SelenideElement subscribers;

    public SubscribersPage goToSubscribersPage() {
        subscribers.click();
        return page(SubscribersPage.class);

    }
}
