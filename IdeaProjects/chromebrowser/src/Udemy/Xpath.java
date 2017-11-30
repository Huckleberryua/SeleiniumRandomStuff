package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qaclickacademy");


    }
}
