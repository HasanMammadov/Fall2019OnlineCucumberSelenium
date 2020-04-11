package com.vytrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    public  static WebDriver createDriver(String browseName){
        if(browseName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();
        }else if(browseName.equalsIgnoreCase("FireFox")){

            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            WebDriverManager.operadriver().setup();
        }


           return new OperaDriver();
    }
}
