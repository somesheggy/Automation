package com.auto.step;

import com.auto.page.object.RegNumbner;
import com.auto.page.object.StartPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dvla {

    private StartPage startPage;
    private RegNumbner regNumbner;

    public Dvla(StartPage startPage, RegNumbner regNumbner) {
        this.startPage = startPage;
        this.regNumbner = regNumbner;
    }

    @When("I find a plate number")
    public void i_find_a_plate_number() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("Validate the car detail")
    public void validate_the_car_detail() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^I search dvla page for registration \"([^\"]*)\"$")
    public void iSearchDvlaPageForRegistration(String reg) {
        startPage.start();
        regNumbner.search(reg);
    }
}
