package com.auto.page.object;

import com.auto.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

public class RegNumber {

    private WebDriver driver;


    @FindBy(id="Vrm")
    public WebElement regSearch;
    @FindBy(className = ".button")
    public WebElement btnContinue;


    public RegNumber(Driver driver) throws IOException {

        WebDriver sdriver = driver.start();
        this.driver = sdriver;
        PageFactory.initElements(sdriver, this);

    }

    public void search(String plateNumber) {
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(regSearch));
        regSearch.sendKeys(plateNumber);
        btnContinue.click();
    }

    public WebDriver driver ()
    {
        return this.driver;
    }

}
