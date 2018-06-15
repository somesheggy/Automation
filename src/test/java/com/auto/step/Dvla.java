package com.auto.step;


import com.auto.Driver;
import com.auto.page.object.Search;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dvla {

    private Search search;

    public Dvla(Search searchParam) {
        this.search = searchParam;

    }

    @Given("I search dvla page")
    public void i_search_dvla_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("I find a plate number")
    public void i_find_a_plate_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Validate the car detail")
    public void validate_the_car_detail() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
