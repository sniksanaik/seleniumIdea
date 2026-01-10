import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By email = By.id("email");
    By password = By.id("pass");
    By loginButton = By.name("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}