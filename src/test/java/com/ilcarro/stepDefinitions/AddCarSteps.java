package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {
    @And("User clicks on LetCarWork link")
    public void clicks_on_LetCarWork_link() {
        new HomePage(driver).clickOnLetCarWorkLink();
    }

    @And("User selects location")
    public void selects_location() {
        new AddCarPage(driver).selectLocation("Tel Aviv");
    }

    @And("User fills car details")
    public void fills_car_details() {
        new AddCarPage(driver).fillsCarDetails("BMW", "X5", "2019",  "4", "C", "AK555", "400", "Diesel");
    }

    @And("User submits the form")
    public void submits_the_form() {
        new AddCarPage(driver).submitForm();
    }

    @Then("User verifies success message is displayed")
    public void verifies_success_message_is_displayed() {
        new AddCarPage(driver).isSuccessMessageDisplayed("Car added");
    }

}
