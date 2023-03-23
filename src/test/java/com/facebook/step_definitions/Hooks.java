package com.facebook.step_definitions;

import com.facebook.utilities.ConfigurationReader;
import com.facebook.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.sk.Tak;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {


    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots,"image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
