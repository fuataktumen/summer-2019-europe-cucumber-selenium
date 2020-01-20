package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I opened the browser and navigate to qa3.vytrack.com");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        System.out.println("I entered user1 and UserUser123");

        LoginPage loginpage= new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginpage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verified that I see the dashboard page");
        BrowserUtils.waitFor(2);
        String ActualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",ActualTitle);
    }
    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        System.out.println("I entered SalesManager123 and UserUser123");
        LoginPage loginpage= new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        loginpage.login(username,password);
    }

    @When("the user enter the store manager information")
    public void the_user_enter_the_store_manager_information() {
        System.out.println("I entered store manager ");

        LoginPage loginpage= new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        loginpage.login(username,password);
    }
    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {
        LoginPage loginpage= new LoginPage();
        loginpage.login(username,password);
    }
}
