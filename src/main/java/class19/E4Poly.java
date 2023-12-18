package class19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E4Poly {

    public static void main(String[] args) throws InterruptedException {

        WebDriver [] arr = {new ChromeDriver(), new FirefoxDriver()};

        for (int i = 0; i < arr.length; i++) {
            WebDriver webDriver=arr[i];

            webDriver.get("https://amazon.com");
            Thread.sleep(2000);
            webDriver.get("https://facebook.com");
            webDriver.navigate().back();
            Thread.sleep(2000);
            webDriver.quit();

        }

    }

}
