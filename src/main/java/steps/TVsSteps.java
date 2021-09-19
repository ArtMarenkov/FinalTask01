package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.TVsPage;


public class TVsSteps extends BaseSteps {

    private TVsPage tVsPage;

    public TVsSteps() {
        tVsPage = new TVsPage(testService.getInitDriver());
    }

    @Step
    public void setFilter(String price) {
        tVsPage.setFilter(price);
    }

    @Step
    public void samsungChoose () {
        tVsPage.samsungClick();
    }

    @Step
    public void lgChoose () {
        tVsPage.lgClick();
    }

    @Step
    public void checkItemCount (int count) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(count,tVsPage.getCountItems());
    }

    @Step
    public void checkFirstItem () {
        String name = tVsPage.getFirstElementName();
        tVsPage.search(name);
        tVsPage.clickSearchButton();
        String expected = name.replaceAll("\\s+","");
        String actual = tVsPage.getActualFirstElementName().replaceAll("\\s+","");
        Assertions.assertEquals(expected, actual);

    }

}
