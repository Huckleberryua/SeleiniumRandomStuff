package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/serj/Documents/selenium-java-3.6.0/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://echoecho.com/htmlforms10.htm");
      //  driver.findElement(By.xpath("//input[@value='Butter']")).click();
       int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

       for (int i = 0;i<count;i++){

          String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
          if (text.equals("Cheese")){
              driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
          }
        }
    }
}
