package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTester {

    public static void main(String[] args) {

        WebDriver webDriver=new ChromeDriver();

        webDriver.get("https://amazon.com");

        WebElement element = webDriver.findElement(By.cssSelector(""));

        element.click();

        webDriver.close();

    }

}
