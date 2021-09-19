package steps;

import io.qameta.allure.Step;
import pages.MarketPage;

public class MarketSteps extends BaseSteps{

    private MarketPage marketPage;

    public MarketSteps() {
        marketPage = new MarketPage(testService.getInitDriver());
    }


    @Step("нажатие на Электроника")
    public void stepElectonics() {
        marketPage.electronicsClick();
    }
}