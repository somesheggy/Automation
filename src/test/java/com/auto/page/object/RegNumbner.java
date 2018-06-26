package com.auto.page.object;

import com.auto.Driver;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class RegNumbner {

    private WebDriver driver;


    @FindBy(how= How.CSS,using="#Vrm")
    WebElement regSearch;
    @FindBy(css = ".button")
    WebElement btnContinue;


    public RegNumbner(Driver driver) throws IOException {

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

}
