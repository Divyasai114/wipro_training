import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TechademyHomeTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set path to chromedriver if necessary
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void openHomePageAndCheckTitle() {
        driver.get("https://one.techademy.com/lxp/Wipro/home");

        // Wait up to 10 seconds for the title to contain "Techademy" (adjust as needed)
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Techademy"));

        // Print the title to verify
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page is: " + pageTitle);

        // Example assertion: Check the title contains "Techademy"
        assert pageTitle.contains("Techademy") : "Page title does not contain 'Techademy'";
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}