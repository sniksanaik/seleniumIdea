import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void facebookLoginTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("testemail@gmail.com");
        loginPage.enterPassword("testpassword");
        Thread.sleep(10000);
        loginPage.clickLogin();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}