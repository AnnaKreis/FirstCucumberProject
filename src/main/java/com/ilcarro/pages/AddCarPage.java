package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddCarPage extends BasePage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement locationField;
    @FindBy(css = ".pac-item")
    WebElement firstSuggestedLocation;

    public AddCarPage selectLocation(String location) {
        type(locationField, location);
        WebDriverWait localWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        localWait.until(ExpectedConditions.visibilityOf(firstSuggestedLocation));
        firstSuggestedLocation.click();
        return this;
    }

    @FindBy(id = "make")
    WebElement manufacturerField;
    @FindBy(id = "model")
    WebElement modelField;
    @FindBy(id = "year")
    WebElement yearField;
    @FindBy(id = "seats")
    WebElement doorsField;
    @FindBy(id = "class")
    WebElement classField;
    @FindBy(id = "serialNumber")
    WebElement serialNumberField;
    @FindBy(id = "price")
    WebElement priceField;
    @FindBy(id = "fuel")
    WebElement fuelField;

    public AddCarPage fillsCarDetails(String manufacturer, String model, String year, String doors, String carsClass, String serialNumber, String price, String fuel) {
        type(manufacturerField, "BMW");
        type(modelField, "x5");
        type(yearField, "1999");
        type(doorsField, "4");
        type(classField, "3");
        type(serialNumberField, "AK556");
        type(priceField, "400");
        selectFuel("Diesel");
        return this;
    }

    public AddCarPage selectFuel(String fuel) {
        new Select(fuelField).selectByVisibleText(fuel);
        return this;
    }

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    public AddCarPage submitForm() {
        click(submitButton);
        return this;
    }

    @FindBy(xpath = "h1[text()='Car added']")
    WebElement successMessage;

    public AddCarPage isSuccessMessageDisplayed(String massage) {
        assert successMessage.getText().contains(massage);
        return this;
    }
}
