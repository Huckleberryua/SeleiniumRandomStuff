package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronization {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/serj/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Implicit wait : driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        driver.findElement(By.id("H-destination")).sendKeys("nyc");
        driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

        //Explicit wait
        WebDriverWait d = new WebDriverWait(driver,10);
      //  d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'North-Bergen-Hotels-Howard')]")));
        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/form/div[11]/div[2]/div[7]/div/header/h1")));


//*[@id="hotelResultTitle"]/div/span[3]/a
        driver.findElement(By.xpath("//a[@id='explore']")).click();
        driver.quit();
        driver.close();

    }

}
