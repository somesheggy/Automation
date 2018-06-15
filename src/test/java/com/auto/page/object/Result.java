package com.auto.page.object;

import com.auto.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Result {

    private WebDriver driver;

    @FindBy(xpath = "//table//tr[@class='heading3']")
    WebElement search;


    public Result(Driver driver) throws IOException {

        WebDriver sdriver = driver.start();
        this.driver = sdriver;
        //This initElements method will create all WebElements
        PageFactory.initElements(sdriver, this);

    }


    public String getHomePageDashboardUserName() {

        return search.getText();

    }

}
