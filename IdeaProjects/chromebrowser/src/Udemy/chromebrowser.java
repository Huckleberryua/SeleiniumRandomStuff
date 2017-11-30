package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/home/serj/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/interview.php");
       // driver.findElement(By.xpath("//*[@id=\"tablist1-tab2\"]/following-sibling::li[2]")).click();
        System.out.print(driver.findElement(By.xpath("//*[@id='tablist1-tab2']/parent::ul/parent::div/parent::div/parent::div")).getAttribute("class"));
        driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
    }
}
