import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

// trying to catch snapshot of failed / Passed
public class Snapshot_DemoTest {
    WebDriver driver;

            @BeforeTest
        public void Launch ()
        {
            System.out.println("Test Before ----");
            System.setProperty("webdriver.gecko.driver", "C:/Program Files/Selenium/firefoxdriver/geckodriver.exe");
            driver = new FirefoxDriver();

        }
        @AfterTest
        public void Close ()
        {

            System.out.println("Close");
            driver.quit();
        }

        @Test
        public void snaptest ()throws Exception {

            try {
                driver.get("http://www.googleddfd.com");
                /*driver.get("http://www.google.com");
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                System.out.println("The File ===>>" + src);
                FileUtils.copyFile(src, new File("E:/workspace/Snapshot_TestResults/snapshot.png"));*/
            } catch (Exception e) {
                System.out.println("================== Exception in the browser =================" + e.getMessage());
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                System.out.println("The File ===>>" + src);
                FileUtils.copyFile(src, new File("E:/  workspace/Snapshot_TestResults/snapshots.png"));
           e.printStackTrace();
        }
        }

    }

