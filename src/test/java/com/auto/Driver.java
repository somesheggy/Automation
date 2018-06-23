package com.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class Driver {


    private ChromeDriverService service;
    private WebDriver driver;

    public WebDriver start() throws IOException {

        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("src/main/resources/chromedriver"))
                .usingAnyFreePort()
                .build();

        ChromeOptions options = new ChromeOptions();
        // Proxy proxy = new Proxy();
        // proxy.setHttpProxy("myhttpproxy:3337");
        // options.setCapability("proxy", proxy);
        // options.addArguments("--headless");
        // options.addArguments("--disable-gpu");
        // options.setAcceptInsecureCerts(true);
        // options.addArguments("--allow-insecure-localhost");
        // options.addArguments("--lang=fr-CA");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(service, options);

        return driver;
    }


    public void stop() {
        service.stop();
    }
}
