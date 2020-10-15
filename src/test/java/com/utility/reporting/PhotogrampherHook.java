package com.utility.reporting;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


import java.util.UUID;


public class PhotogrampherHook {
    @Autowired
    private WebDriver webDriver;

    @Value("${take.screenshot.condition:everStep}")
    private TakeScremsotCondition takeScremsotCondition;

    @After
    public void takeScreenshotAfterScenario(Scenario scenario){
        if(TakeScremsotCondition.everStep == takeScremsotCondition){
            takeScreenshot(scenario);
        }

    }

    @AfterStep //ejucuta desde de cada
    public void takeScreensoftEveryScenary(Scenario scenario){
        if(TakeScremsotCondition.everStep == takeScremsotCondition){
            takeScreenshot(scenario);
        }

    }

    @After
    public void takeScreenshotFailScenario(Scenario scenario){
        if(TakeScremsotCondition.failingScenary ==takeScremsotCondition && scenario.isFailed()){
            takeScreenshot(scenario);
        }

    }

    private void takeScreenshot(Scenario scenario){
        try {
            final byte [] screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png", UUID.randomUUID().toString());

        }catch (WebDriverException e){
            System.out.println("scenario = " + e.getMessage());
        }

    }
}
