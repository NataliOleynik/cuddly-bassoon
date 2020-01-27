package com.academy.dev.automationpractice;

import com.academy.dev.automationpractice.allure.TestListener;
import com.academy.dev.automationpractice.page.AuthenticationPage;
import com.academy.dev.automationpractice.page.HomePage;
import com.academy.dev.automationpractice.page.MyAccountPage;
import com.academy.dev.core.BaseTest;
import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SuccessfulAuth extends BaseTest {
    private final static Logger LOG = LogManager.getLogger(SuccessfulAuth.class.getName());

    @Description("тестируем успешный логин")
    @Test(dataProvider = "correctAuthDataProvider")
    public void testSuccessfulAuthorization(String login, String password) {
//        LOG.info("start testSuccessfulAuthorization");

        HomePage homePage = new HomePage(driver, baseUrl);
        homePage.goToHomePage();
        AuthenticationPage authenticationPage = homePage.clickSignIn();
        authenticationPage = authenticationPage.fillEmail(login);
        authenticationPage = authenticationPage.fillPassword(password);
        MyAccountPage myAccountPage = authenticationPage.clickSubmitSuccessLogin();
        myAccountPage = myAccountPage.availableViewAccountButton();
        myAccountPage = myAccountPage.availableSignOutButton();
        authenticationPage = myAccountPage.clickSignOutButton();

//        LOG.info("finished testUnsuccessfulAuth");

    }

    @DataProvider(name = "correctAuthDataProvider")
        public Object[][] correctAuthDataProvider() throws IOException {
        String file = properties.getProperty("data.dir") + "/corr_auth_test_data.csv";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> data = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().startsWith("#"))
                data.add(line);
        }
        br.close();
        fr.close();

        System.out.println("******");
        System.out.println(data);
        Object[][] result = new Object[data.size()][2];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i).split(",");
        }

        System.out.println("****Array");
        System.out.println(Arrays.deepToString(result));
        return result;
    }
}
