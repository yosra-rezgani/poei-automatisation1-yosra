package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By searchBarLocator = By.cssSelector("#twotabsearchtextbox");
    By toutes = By.id("nav-hamburger-menu");
    By jeuConsole = By.cssSelector("[data-menu-id='12']");
    By alljeuVideo = By.cssSelector("ul.hmenu.hmenu-visible.hmenu-translateX > li a[class='hmenu-item']");

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String keyword) {
        driver.findElement(searchBarLocator).sendKeys(keyword + Keys.ENTER);
    }

    public void goToGamesAndConsolesPage() {
        driver.findElement(toutes).click();
        driver.findElement(jeuConsole).click();
        driver.findElement(alljeuVideo).click();

    }
}