package com.auto.step;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;


public class Hook {
    //private BaseUtil base;

    //public Hook(BaseUtil base) {
        //this.base = base;
   // }


    @Before
    public void InitializeTest() {

}

    @After
    public void TearDownTest (Scenario scenario)

    {

        if (scenario.isFailed()) {

            //Take screenshot
            System.out.println (scenario.getName());
        }

        System.out.println("Closing the browser : MOCK");

    }

    @Test
    private void quick() {

        public void whenTheUserSearchesForSeleniumTheResultPageTitleShouldContainCats () {
            page.searchFor("selenium");
            assertThat(page.getTitle(), containsString("selenium"));

        }
    }
}

