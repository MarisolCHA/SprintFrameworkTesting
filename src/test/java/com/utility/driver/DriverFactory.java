package com.utility.driver;

import com.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URI;
@Component
public class DriverFactory {
    private static String path = System.getProperty("user.dir") + "/src/test/resources/drivers/mac/%s";

    @Value("${grid.url}")
    private String gridUrl;

    @Value("${remote.execution}")
    private boolean remoteExecution;

    public  WebDriver get(Browser browser) throws MalformedURLException {
        WebDriver driver = null;
        if(remoteExecution){
            driver =  getRemoteDriver(browser);
        }

        if(Browser.chrome == browser){
            System.setProperty("webdriver.chrome.driver",  String.format(path,"chromedriver"));
            driver =  new ChromeDriver();
        }else if(Browser.firefox == browser){
            //https://github.com/mozilla/geckodriver/releases
            System.setProperty("webdriver.gecko.driver",  String.format(path,"geckodriver"));
            driver = new FirefoxDriver();
        }
        return driver;
    }
    private RemoteWebDriver getRemoteDriver(Browser browser) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser.name());
        // grabar y ver remotewebdriver
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        return new RemoteWebDriver(URI.create(gridUrl).toURL(),capabilities);
    }
}
