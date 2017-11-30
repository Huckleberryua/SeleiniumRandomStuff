package Udemy;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class formMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.makemytrip.com");
        System.out .println("Before clicking on Multicity Radiobutton");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());

        System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).click();
        System.out.println("After clicking on Multicity Radiobutton");
       Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());

;
//        if u want to check whether the object is the present in the page just
//        get the xpath/css selector and check if .size()=0 using driver.findElements

       System.out.println(driver.findElement(By.xpath("/html/body/footer/div[1]/section/h5[1]")).getText());
    }
}
