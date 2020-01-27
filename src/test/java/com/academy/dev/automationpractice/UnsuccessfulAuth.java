package com.academy.dev.automationpractice;

import com.academy.dev.automationpractice.page.AuthenticationPage;
import com.academy.dev.automationpractice.page.HomePage;
import com.academy.dev.core.AssertWithLogging;
import com.academy.dev.core.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class UnsuccessfulAuth extends BaseTest {
    private final static Logger LOG = LogManager.getLogger(UnsuccessfulAuth.class.getName());

    @Description("Тестируем неуспешный логин")
    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testUnsuccessfulAuthorization(String login, String password, String expectedErrMsg) {
//        LOG.info("start testIncorrectLogin");
//        driver.get(baseUrl);
//        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(login);
//        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(password);
//        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
//        driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();

        // 1й способ - длинный
//        HomePage homePage = new HomePage(driver, baseUrl);
//        homePage = homePage.goToHomePage();
//        AuthenticationPage authenticationPage = homePage.clickSignIn();
//        authenticationPage = authenticationPage.fillEmail(login);
//        authenticationPage = authenticationPage.fillPassword(password);
//        authenticationPage = authenticationPage.clickSubmitLogin();
//        String actualErrMsg = authenticationPage.getErrMsg();
//        Assert.assertEquals(actualErrMsg, expectedErrMsg);

        // 2й способ - короткий
        AuthenticationPage authenticationPage = new HomePage(driver, baseUrl)
                .goToHomePage()
                .then()
                .clickSignIn()
                .fillEmail(login)
                .fillPassword(password)
                .clickSubmitUnsuccessLogin();

        String actualErrMsg = authenticationPage.getErrMsg();
        AssertWithLogging.assertEquals(actualErrMsg, expectedErrMsg);

//        LOG.info("finished testUnsuccessfulAuth");

    }

    @DataProvider(name = "incorrectAuthDataProvider")
    public Object[][] incorrectAuthDataProvider() throws IOException {

        String file = properties.getProperty("data.dir") + "/incorr_auth_test_data.csv";
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

        LOG.debug("***List***");
        LOG.debug(data);

        Object[][] result = new Object[data.size()][3];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i).split(",");
        }

        LOG.debug("***Array***");
        LOG.debug(Arrays.deepToString(result));
        return result;
    }
}
