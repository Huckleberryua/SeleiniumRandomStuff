package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts  {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
        String s = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept(); //Accept alert
//        driver.switchTo().alert().sendKeys("testing purposes");
//        driver.switchTo().alert().dismiss();//cancel
        System.out.println(s);

    }
}
