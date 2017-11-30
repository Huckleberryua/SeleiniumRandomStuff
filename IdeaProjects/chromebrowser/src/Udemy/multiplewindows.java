package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class multiplewindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/p/a")).click();
        System.out.println(driver.getTitle());

        Set<String> ids = driver.getWindowHandles();
        Iterator<String>it=ids.iterator();

        String parentid = it.next();
        String child = it.next();
        driver.switchTo().window(parentid);
        driver.findElement(By.xpath("\n")).isDisplayed();

    }
}
