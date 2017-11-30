package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
            driver.get("http://qaclickacademy.com");
            System.out.println(driver.getTitle());
            System.out.println(driver.getPageSource());
            System.out.println(driver.getCurrentUrl());
            driver.close();

    }
}
// /home/serj/Documents/selenium-java-3.6.0/geckodriver