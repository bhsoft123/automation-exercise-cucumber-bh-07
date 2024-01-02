package com.automationexercise.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//        How to locate disappearing message on Selenium?
//3 Answers
//Open the previous page before the notification.
//Press "Ctrl+Shift+c", Navigate to "sources" tab.
//Do the manual step to generate the notification, which is going to hide in few seconds.
//Press "F8". Page load scripts will be paused.
//Then inspect the element as usual and fetch the xpath at your convenience.
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/automationexercise/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression"
)
public class RegressionTest extends AbstractTestNGCucumberTests {

}
