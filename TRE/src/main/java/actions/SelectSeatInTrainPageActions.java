package actions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.SelectSeatInTrainPage;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelectSeatInTrainPageActions {
    SelectSeatInTrainPage page = new SelectSeatInTrainPage();
    @Step("Selects seats in train")
    @Description("This step searches  for available seat in train and chooses it")
    public void selectTrainTicket(){


        if (page.wagons.size() > 2 && page.wagons.get(0).isDisplayed()) {
            SelenideElement wagon = page.wagons.get(0);
            ElementsCollection paths = wagon.findAll(By.tagName("path"));

            for (SelenideElement path : paths) {
                if (path.isDisplayed() && path.isEnabled()) {
                    new Actions(getWebDriver()).click(path).perform();
                    page.chooseReturnButton.click();

                }
            }
        }

    }
    @Step("Selects return seats in train")
    @Description("This step searches  for available seat in return train and chooses it")
    public void selectReturnTrainTicket(){


        page.wagons.get(3).scrollIntoView(true);
        if ( page.wagons.get(3).isDisplayed()) {
            SelenideElement wagon = page.wagons.get(3);
            ElementsCollection paths = wagon.findAll(By.tagName("path"));
            for (SelenideElement path : paths) {
                if (path.isDisplayed() && path.isEnabled()) {
                    new Actions(getWebDriver()).click(path).perform();
                    page.chooseButton.click();


                }
            }
        }
    }

}
