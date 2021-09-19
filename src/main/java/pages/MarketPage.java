package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class MarketPage {

    private WebDriver driver;
    @FindBy(xpath = "//a[@href = '/catalog--elektronika/54440']") //Путь к кнопке "Электроника"
    public WebElement electronics;

    public MarketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void electronicsClick() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        electronics.findElement(By.xpath("//a[@href = '/catalog--elektronika/54440']"));
        electronics.click();
    }


}
