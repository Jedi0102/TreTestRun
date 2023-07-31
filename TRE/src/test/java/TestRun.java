import actions.*;
import data.CommonData.FilePaths;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.BaseTest;
import utility.HelperFunctions;

@Epic("E2E test of ticket purchasing process")
@Story("This test run tests whole ticket buying process ," +
        " while choosing tickets with desired price also selects dates" +
        "while covering registration and paying process")
public class TestRun extends BaseTest {


    FilePaths filePaths=new FilePaths();
    HelperFunctions helperFunctions=new HelperFunctions();
    MainPageActions mainPageActions = new MainPageActions();
    ChooseTicketPageActions chooseTicketPageActions = new ChooseTicketPageActions();
    SelectSeatInTrainPageActions selectSeatInTrainPageActions = new SelectSeatInTrainPageActions();
    PassengerDetailsPageActions passengerDetailsPageActions = new PassengerDetailsPageActions();
    ContactUserDetailPageActions contactUserDetailPageActions = new ContactUserDetailPageActions();

    @Step("Set up")
    @Description("This method sets up browser for testing web site")
    @BeforeMethod
    public void start(){
        helperFunctions.parseProperties(filePaths.configsPath);
        setUp(helperFunctions.url);


    }
    @Step("Testing purchase process")
    @Description("This method tests e2e of purchase process including selecting tickets" +
            " , dates also registration process and buying tickets")
    @Test
    public void testPurchaseProcess() throws InterruptedException {
        mainPageActions.fromFieldClick();
        mainPageActions.selectTbilisi();

        mainPageActions.toFieldClick();
        mainPageActions.selectBatumi();

        mainPageActions.departureFieldClick();
        mainPageActions.chooseDesiredDate();

        mainPageActions.clickReturnField();
        mainPageActions.selectReturnDate();

        mainPageActions.clickSearchButton();

        chooseTicketPageActions.chooseFirstOptionOfFirstTicket();
        chooseTicketPageActions.chooseReturnFirstOptionOfFirstTicket();

        chooseTicketPageActions.submitTicketButton();
        Thread.sleep(1000);

        selectSeatInTrainPageActions.selectTrainTicket();
        Thread.sleep(1000);
        selectSeatInTrainPageActions.selectReturnTrainTicket();


        passengerDetailsPageActions.fillUserNameField();
        passengerDetailsPageActions.fillUserLastNameField();
        passengerDetailsPageActions.fillUserIdField();
        passengerDetailsPageActions.submitUserDetails();

        contactUserDetailPageActions.fillUserEmail();
        contactUserDetailPageActions.fillUserPhoneNumber();
        contactUserDetailPageActions.submitUserContact();


        Thread.sleep(4444);





    }
    @Step("Tear down")
    @Description("This steps cleans up all the process with shutting down browser")
    @AfterMethod
    public void cleanUp(){
        tearDown();
    }

}
