package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GamesAndConsolesPage {
    String firstItemActual;
    String url = "https://www.amazon.fr";
    String firstItemExpected = "The Legend of Zelda : Tears of the Kingdom";
    String expectedPrice = "54.99";
    String expectedMessage = "Cet article paraîtra le 12 mai 2023.";

    By proposalItem = By.cssSelector("[data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] span.a-list-item"); // [data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] > div div ul li span.a-list-item

    WebDriver driver;

    static final int TIMEOUT_SIDE_PANEL = 5; // 5s
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SIDE_PANEL));

    public GamesAndConsolesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void  OpenBestSeller(int index) {
        driver.findElement(proposalItem).click();

    }
}
