package com.academy.selenide;

import com.academy.selenide.page.HomePage;
import com.academy.selenide.page.SubscribersPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class MobileTests {

    @BeforeClass
    public void setUp() {
        Configuration.baseUrl = "localhost:8081";
        Configuration.timeout = 3000;
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @Test
    public void testCreateSubscriber() {
        open(baseUrl);
        $(byPartialLinkText("Subscribers")).click();
        List<String> lastNamesBefore = $$(byXpath("//td[4]")).texts();
        System.out.println(lastNamesBefore);
        $(byId("add")).click();
        $(byId("fname")).sendKeys("FirstName");
        $(byId("lname")).sendKeys("LastName");
        $(byId("FEMALE")).click();
        $(byId("age")).clear();
        $(byId("age")).sendKeys("18");
        $(byCssSelector(".btn.btn-success")).click();
        sleep(3000);


        List<String> lastNamesAfter = $$(byXpath("//td[4]")).texts();
        Assert.assertEquals(lastNamesBefore.size()+ 1, lastNamesAfter.size());

        lastNamesBefore.add("LastName");
        Collections.sort(lastNamesBefore);
        Collections.sort(lastNamesAfter);

        Assert.assertEquals(lastNamesBefore, lastNamesAfter);
        sleep(3000);
    }

    @Test
    public void testCreateSubscriberPageObject() {
        SubscribersPage subscribersPage = open(baseUrl, HomePage.class)
                .goToSubscribersPage()
                .clickAdd()
                .fillFirstName("Ashot")
                .fillLastName("Gurenovich")
                .setAsFemale()
                .fillAge(50)
                .submit();

        List<String> lastNames = subscribersPage.getLastNames();
        System.out.println(lastNames);
//        Assert.fail();
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
