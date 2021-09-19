package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy (xpath = "//nav[@aria-label = 'Сервисы']")   // Общее верхнее меню
    WebElement mainMenu;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectMarketMenu() {

        mainMenu.findElement(By.xpath("//a[@data-id = 'market']")).click();  // Нажатие на "Маркет"
    }

}
