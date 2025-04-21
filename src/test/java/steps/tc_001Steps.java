package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver = new ChromeDriver();
    tc_001Page googleSheetPage = new tc_001Page(driver);

    @Given("I navigate to the Google Sheet URL")
    public void i_navigate_to_the_google_sheet_url() {
        googleSheetPage.openPage();
    }

    @Then("the Google Sheet should load correctly without errors")
    public void the_google_sheet_should_load_correctly_without_errors() {
        assert googleSheetPage.isPageLoaded() : "Google Sheet did not load correctly";
        driver.quit();
    }
}