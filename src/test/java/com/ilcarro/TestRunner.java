package com.ilcarro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "/com/ilcarro/stepDefinitions",
        tags = "@validAddCar",
        plugin = {"pretty", "json:build/cucumber-report/cucumber.json"})

public class TestRunner {
}

//gradle clean test