import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firefox_Demo {

    WebDriver driver;

    @Test
    public void Search() throws Exception {

        Thread.sleep(10000);
        System.out.println("Test Search --------");
        driver.findElement(By.xpath("//input[@name='q']"));
    }

        @BeforeTest
        public void Launch()
        {
            System.out.println("Test Before ----");
            System.setProperty("webdriver.gecko.driver", "C:/Program Files/Selenium/firefoxdriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.google.com/");
        }
        @AfterTest
        public void Close()
        {

            System.out.println("Close");
            driver.quit();
        }


}
