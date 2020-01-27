package com.academy.dev;

import com.academy.dev.core.BaseTest;
import org.testng.annotations.*;
import org.openqa.selenium.*;


public class LoginTests extends BaseTest {
    private String baseUrl = "https://dev.rallyware.com/login";

    @Test(dataProvider = "correctAuthDataProvider")
    public void testCorrectLogin(String login, String password) { //    public void testIncorrectLogin(String login, String password, String errorMessage)
        driver.get(baseUrl);
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(login); //"natalia.oleynik@rallyware.com"
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password); // "123123123"
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Register'])[1]/following::div[3]")).click();
        driver.findElement(By.xpath("//div[4]")).click();
        driver.findElement(By.xpath("//div[4]")).click();
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        driver.findElement(By.cssSelector("#user-quick-actions")).click();
        driver.findElement(By.cssSelector("#header > div > section > div:nth-child(2) > div.mdc-menu-surface--anchor.base-header__user-actions > div.mdc-menu.mdc-menu-surface.mdc-menu-surface--open > ul > a:nth-child(4) > li")).click();


    }
//
//    // нужне переделать для dev инстанса (этот кусок кода будет работать только для automition pr сайта)
//    @DataProvider(name = "correctAuthDataProvider")
//    public Object[][] correctAuthDataProvider() throws IOException {
//
//        String file = properties.getProperty("data.dir") + "/incorr_auth_test_data.csv";
//        FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
//        ArrayList<String> data = new ArrayList<>();
//        String line;
//        while ((line = br.readLine()) != null) {
//            if (!line.trim().startsWith("#"))
//            data.add(line);
//        }
//        br.close();
//        fr.close();
//
//        // todo log
//        System.out.println("******");
//        System.out.println(data);
//        Object[][] result = new Object[data.size()][3];
//        for (int i = 0; i < data.size(); i++) {
//            result[i] = data.get(i).split(",");
//        }
//
//        System.out.println("****Array");
//        System.out.println(Arrays.deepToString(result));
//        return result;
//    }
}
