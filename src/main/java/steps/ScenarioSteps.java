package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.TestService;

public class ScenarioSteps {

    TestService testService = new TestService();{
        testService.getInitDriver().get(testService.getBaseURL());
    }
    private WebDriver driver = testService.getInitDriver();
    private MainSteps mainSteps;
    private MarketSteps marketSteps;
    private ElectronicsSteps electronicsSteps;
    private TVsSteps tVsSteps;

    @When("^выбран сервис Маркет$")
    public void stepMarketMenu() {
        mainSteps = new MainSteps();
        mainSteps.stepMarketMenu();
    }

    @When("^выбрана категория Электроника$")
    public void stepElectronic() {
        marketSteps = new MarketSteps();
        marketSteps.stepElectonics();
    }

    @When("^выбрана категория Телевизоры$")
    public void stepTVsButtonClick() {
        electronicsSteps = new ElectronicsSteps();
        electronicsSteps.stepTVsButtonClick();
    }


    @When("^установлен фильтра по цене =\"(.+)\"$")
    public void setFilterStep(String menuItem) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tVsSteps = new TVsSteps();
        tVsSteps.setFilter(menuItem);
    }

    @When("^установлен производитель Samsung$")
    public void samsungChoose() {
        tVsSteps.samsungChoose();
    }

    @When("^установлен производитель LG")
    public void lgChoose() {
        tVsSteps.lgChoose();
    }

    @When("^количество элементов на странице\"(.+)\"$")
    public void checkItemsCount (int count) {
        tVsSteps.checkItemCount(count);
    }

    @Then("^наименование найденного товара соответствует запомненному значению$")
    public void checkFirstItemWithSearch () {
        tVsSteps.checkFirstItem();
    }

    @After
    public void tearDown() {
        testService.getInitDriver().quit();
    }

}
