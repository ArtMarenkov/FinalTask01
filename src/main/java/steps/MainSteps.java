package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainSteps extends BaseSteps {
    private MainPage mainPage;

    public MainSteps() {
        mainPage = new MainPage(testService.getInitDriver());
    }

    @Step("Нажатие на Маркет")
    public void stepMarketMenu() {
        mainPage.selectMarketMenu();
    }
}
