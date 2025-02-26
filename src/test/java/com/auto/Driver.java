package com.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class Driver {


    private ChromeDriverService service;
    private FirefoxDriver firefox;
    private WebDriver driver;

    public WebDriver start() throws IOException {

/*        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("src/main/resources/chromedriver"))
                .usingAnyFreePort()
                .build();
        service.start();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(service, options);*/

        System.setProperty("webdriver.firefox.marionette", "geckodriver");
        FirefoxOptions options = new FirefoxOptions()
                .setProfile(new FirefoxProfile());
        driver = new FirefoxDriver(options);
        return driver;
    }


    public void stop() {
        service.stop();
    }
}
