package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/serj/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com/");
         /*  Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("2");
        s.selectByIndex(6);
        s.selectByVisibleText("5 Adults");
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.cssSelector("a[value='DEL']")).click();
        driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();*/
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
    }
}
