package com.academy.selenide.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.page;

public class SubscribersPage {

    @FindBy(id = "add")
    private SelenideElement addButton;

    @FindBy(xpath = "//td[4]")
    private ElementsCollection lastNames;

    public SubscribersPage() {
        page(MenuPage.class);
    }

    public CreationFormPage clickAdd() {
        addButton.click();
        return page(CreationFormPage.class);
    }

    public List<String> getLastNames() {
        return lastNames.texts();
    }
}
