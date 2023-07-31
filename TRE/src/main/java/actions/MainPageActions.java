package actions;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageActions {
    MainPage page = new MainPage();
    @Step("Clicking on from field")

    public void fromFieldClick(){
        page.fromField.click();
    }
    @Step("Selecting departure location")
    @Description("This step selects tbilisi in fromField")

    public void selectTbilisi(){
        for (SelenideElement loc : page.locations) {
            if (loc.getText().contains("თბილისი")) {
                loc.click();
                break;


            }

        }

    }
    @Step("Clicking on to field")
    public void toFieldClick(){
        page.toField.click();
    }
    @Step("Selecting destination location")
    @Description("This step selects batumi in toField")
    public void selectBatumi(){
        for (SelenideElement loc : page.destination) {
            if (loc.getText().contains("ბათუმი")) {
                loc.click();
                break;


            }

        }
    }
    @Step("Clicking on departure date field")

    public void departureFieldClick(){
       page.departureField.click();
    }
    @Step("Choosing departure date")
    @Description("This step selects august month to select desired date")

    public void chooseDesiredDate (){
        while (page.departureHeader.getText().contains("August")==false||page.departureHeader.getText().contains("აგვისტო")==false||page.departureHeader.getText().contains("август ")==false) {
            page.switchMonthsButton.click();
            if(page.departureHeader.getText().contains("August")||page.departureHeader.getText().contains("აგვისტო")||page.departureHeader.getText().contains("август ")) {
                page.dateForDeparture.click();
                break;

            }

        }
    }
    @Step("Clicking on return date field ")

    public void  clickReturnField(){
        page.addReturnField.click();
    }
    @Step("Selecting return date ")
    public void selectReturnDate(){
        page.dateForReturn.click();
    }
    @Step("Clicking search button ")
    @Description("This step clicks on search button")
    public void clickSearchButton(){
        page.searchButton.click();
    }



}
