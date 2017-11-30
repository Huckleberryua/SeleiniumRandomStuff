package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
      //  driver.get("http://qaclickacademy.com");
       // driver.findElement(By.xpath("//*[@id='teacher-form']/button")).click();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("Testingstuff");
        driver.findElement(By.name("pass")).sendKeys("123");
       // driver.findElement(By.id("loginbutton")).clikck();
         driver.findElement((By.linkText("Forgot account?"))).click();
       //  driver.findElement((By.partialLinkText("Forgot"))).click();
    }
}

//Udemy.Xpath => //tagname[@attribute='value']
