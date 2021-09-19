package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {

    @FindBy(xpath = "//li/div/a[contains(@href,'/catalog--televizory')]") // //Путь к кнопке "Телевизоры"
    public WebElement tvsButton;  //tvsButton

    public ElectronicsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void electronicsClick () {
        tvsButton.click();
    }

}
