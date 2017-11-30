package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com/");
       // driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("TestingPurpose");
      //  driver.findElement(By.cssSelector("input[id='password']")).sendKeys("TestingPurpose");
       // driver.findElement(By.xpath("//input[@id='Login']")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("test");
    }
}
