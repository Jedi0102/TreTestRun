package actions;

import data.PassengerDetailsData.PassengersDetailsData;
import io.qameta.allure.Step;
import pages.PassengerDetailsPage;

public class PassengerDetailsPageActions {
    PassengerDetailsPage page = new PassengerDetailsPage();
    PassengersDetailsData data = new PassengersDetailsData();
    @Step("Filling user's name field ")
    public void fillUserNameField () {
        page.userName.setValue(data.userName);

    }


    @Step("Filling user's last name field")
    public void fillUserLastNameField(){

        page.userLastName.setValue(data.userLastName);
    }
    @Step("Filling user's id field")

    public void fillUserIdField(){
        page.userId.setValue(data.userId);
    }
    @Step("Submits user's details")
    public void submitUserDetails(){
        page.submitUserDetails.click();
    }


}
