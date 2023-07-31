package actions;


import io.qameta.allure.Description;
import io.qameta.allure.Step;
import pages.ChooseTicketPage;

public class ChooseTicketPageActions {
    ChooseTicketPage page = new ChooseTicketPage();
    @Step("Choosing first ticket")
    @Description("This step selects first option of first ticket")
    public void  chooseFirstOptionOfFirstTicket(){
        page.firstOutboundFirstOption.click();
    }

    @Step("Choose return ticket")
    @Description("This step selects first option of return ticket")
    public void chooseReturnFirstOptionOfFirstTicket(){

       page.firstReturnOutboundFirstOption.click();
    }
    @Step("Submit tickets")
    @Description("This step submits tickets ")
     public void submitTicketButton(){
         page.submitTicketButton.click();
     }



}
