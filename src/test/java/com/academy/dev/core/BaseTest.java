package com.academy.dev.core;

import com.academy.dev.automationpractice.allure.TestListener;
import com.academy.dev.core.listener.WebDriverEventListenerImpl;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    protected EventFiringWebDriver driver;
    protected String baseUrl;
    protected Properties properties;
    private final static Logger LOG = LogManager.getLogger(BaseTest.class.getName());


    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) throws IOException {
        properties = new Properties();
        // вычитываем файл *.properties из директории <root>/src/main/java/resources
        properties.load(this.getClass().getClassLoader().getResourceAsStream("common.properties"));
        baseUrl = properties.getProperty("baseUrl");
//        // Инициализируем драйвера
//        System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
//        System.setProperty("webdriver.gecko.driver", properties.getProperty("firefox.driver"));
//        driver = new FirefoxDriver();
//        driver = new ChromeDriver();

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.driver"));
                driver = new EventFiringWebDriver(new ChromeDriver());
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("firefox.driver"));
                driver = new EventFiringWebDriver(new FirefoxDriver());
                break;
        }

        driver.register(new WebDriverEventListenerImpl(properties.getProperty("screenshot.dir")));

        // Неявное ожидание (Implicit Waits)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        // Закрываем браузер (все окна)
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod(Method method, Object[] params) {
        LOG.info("Start test {} with parameters {} ", method.getName(), Arrays.toString(params));
    }

    @AfterMethod
    public void afterMethod(Method method) {
        LOG.info("Finished test {} ", method.getName());
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG() {
        return driver.getScreenshotAs(OutputType.BYTES);
    }

}

