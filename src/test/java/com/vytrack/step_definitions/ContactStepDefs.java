package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactStepDefs {


    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String> menuOptions) {
        System.out.println("menuOptions size = " + menuOptions.size());
        System.out.println("menuOptions = " + menuOptions);
        DashboardPage dashboardPage = new DashboardPage();
       List<String> actualMenuOptions= BrowserUtils.getElementsText(dashboardPage.menuOptions);
       BrowserUtils.waitFor(4);
        System.out.println(actualMenuOptions);
        Assert.assertEquals(menuOptions,actualMenuOptions);
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userData) {

        new LoginPage().login(userData.get("username"),userData.get("password"));

             BrowserUtils.waitFor(3);
            String expectedData = userData.get("firstname") + " " + userData.get("lastname");
            DashboardPage dashboardPage= new DashboardPage();

            String actualData = dashboardPage.userName.getText();
            Assert.assertEquals(expectedData,actualData);
    }
    @Then("the title should contains {string}")
    public void the_title_should_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

}
