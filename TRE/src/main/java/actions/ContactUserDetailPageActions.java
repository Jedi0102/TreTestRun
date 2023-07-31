package actions;

import data.UserContactData.UserContactData;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import pages.ContactUserDetailsPage;

public class ContactUserDetailPageActions {
    UserContactData data = new UserContactData();
    ContactUserDetailsPage page = new ContactUserDetailsPage();
    @Step("Fill user's name")
    @Description("This step fills user's name with data from UserContactData")
    public void fillUserEmail(){

        page.userEmail.setValue(data.userEmail);
    }
    @Step("Fill user's phone number")
    @Description("This step fills user's phone number with data from User")

    public void fillUserPhoneNumber(){
        page.userPhoneNumber.setValue(data.userPhoneNumber);

    }
    @Step("Submit user contact data")
    @Description("This step submits user's contact data")
    public void submitUserContact(){
        page.userContactSubmitButton.click();
    }

}
