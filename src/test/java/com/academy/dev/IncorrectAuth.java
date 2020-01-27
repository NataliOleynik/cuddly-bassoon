package com.academy.dev;

import com.academy.dev.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class IncorrectAuth extends BaseTest {

    @Test(dataProvider = "incorrectAuthDataProvider")
    public void testIncorrectLogin(String login, String password, String errMsg) {
        driver.get("http://automationpractice.com/index.php");
        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
        signInButton.click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(login); // "qwerty"
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(password); // "1234"
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::span[1]")).click();
        driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
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

        // todo log
        System.out.println("******");
        System.out.println(data);
        Object[][] result = new Object[data.size()][3];
        for (int i = 0; i < data.size(); i++) {
            result[i] = data.get(i).split(",");
        }

        System.out.println("****Array");
        System.out.println(Arrays.deepToString(result));
        return result;
    }
}
