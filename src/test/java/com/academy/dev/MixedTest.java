package com.academy.dev;

import com.academy.dev.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class MixedTest extends BaseTest {

    @Test
    public void testSearchAndSort() {
        driver.get(baseUrl);
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys("Dress");
        driver.findElement(By.name("submit_search")).click();
        driver.findElement(By.cssSelector("#list > a")).click();

//        HomePage homePage = new HomePage(driver, baseUrl);

        // Подождать
//        new WebDriverWait(driver, Duration.ofSeconds(5))
        new WebDriverWait(driver, 5000)
                .until(ExpectedConditions.attributeToBe(
                        By.id("list"), "class", "selected"
                ));

        // Сортировка
        Select select = new Select(driver.findElement(By.id("selectProductSort")));
        select.selectByValue("name:desc");
        driver.findElement(By.cssSelector("#list > a")).click();

        // Проверки
        WebElement titleElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div > h5 > a"));
        String titleText = titleElement.getText().trim();
        WebElement priceElement = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1) > div > div > div.right-block > div > div > span.price.product-price"));
        String priceText = priceElement.getText().trim();

        Assert.assertEquals(titleText, "Printed Summer Dress");
        Assert.assertEquals(priceText, "$28.98");
    }

}


