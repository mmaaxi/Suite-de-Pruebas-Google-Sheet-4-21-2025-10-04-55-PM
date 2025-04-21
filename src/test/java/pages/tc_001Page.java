package pages;

import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    private final String PAGE_URL = "https://docs.google.com/spreadsheets/d/1_Lj7OTF35z9O4un4KH6PgZ1njgiVr8N4H89XrI9RJWs";

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
    }

    public boolean isPageLoaded() {
        return driver.getTitle().contains("Google Sheets");
    }
}