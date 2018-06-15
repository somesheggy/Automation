package com.auto;

import org.openqa.selenium.WebDriver;
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
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.setBinary("/path/to/other/chrome/binary");
//        options.setBinary("/path/to/other/chrome/binary");
         //options.addArgument("headless");

       // driver = new ChromeDriver(options);

            service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("chromedriver"))
                    .usingAnyFreePort()
                    .build();
            service.start();

        driver = new RemoteWebDriver(service.getUrl(),
                DesiredCapabilities.chrome());

        return driver;
    }


    public void stop(){
        service.stop();
    }
}
