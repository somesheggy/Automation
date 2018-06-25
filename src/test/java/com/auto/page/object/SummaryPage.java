package com.auto.page.object;


import com.auto.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SummaryPage {

    private WebDriver driver;


    @FindBy(name = "Registration")
    public WebElement RegNos;
    @FindBy(name = "RegistrationLabel")
    public WebElement RegNosLab;
    @FindBy(name = "Maker")
    public WebElement Make;
    @FindBy(name = "MakeLabel")
    public WebElement MakeLab;
    @FindBy(name = "Color")
    public WebElement Colour;
    @FindBy(name = "ColorLabel")
    public WebElement ColourLab;



    public SummaryPage(Driver driver) throws IOException {

        WebDriver sdriver = driver.start();
        this.driver = sdriver;
        PageFactory.initElements(sdriver, this);

    }

}
