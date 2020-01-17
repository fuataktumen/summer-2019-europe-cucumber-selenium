package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @Given("The sales manager should be main page")
    public void the_sales_manager_should_be_main_page() {
        System.out.println("The sales manager should be main page");
    }

    @When("the sales manager should be able to navigate Fleet --> Vehicles modules")
    public void the_sales_manager_should_be_able_to_navigate_Fleet_Vehicles_modules() {
        System.out.println("the sales manager should be able to navigate Fleet --> Vehicles modules");
    }

    @Then("the sales manager should see correct page url")
    public void the_sales_manager_should_see_correct_page_url() {
        System.out.println("the sales manager should see correct page url");
    }

    @When("the sales manager should be able to navigate Marketing --> Campaigns modules")
    public void the_sales_manager_should_be_able_to_navigate_Marketing_Campaigns_modules() {
        System.out.println("the sales manager should be able to navigate Marketing --> Campaigns modules");
    }

    @When("the sales manager should be able to navigate Activities --> Calendar Events modules")
    public void the_sales_manager_should_be_able_to_navigate_Activities_Calendar_Events_modules() {
        System.out.println("the sales manager should be able to navigate Activities --> Calendar Events modules");
    }

}
