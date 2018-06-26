package com.auto.page.object;


import com.auto.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class StartPage {

        private WebDriver driver;
         private String url ="https://www.gov.uk/get-vehicle-information-from-dvla";

        @FindBy(className = "gem-c-button--start")
        WebElement start;

        public StartPage(Driver driver) throws IOException {

            WebDriver sdriver = driver.start();
            this.driver = sdriver;
            PageFactory.initElements(sdriver, this);
            sdriver.get(url);

        }

        public void start() {

            start.click();

        }

}
