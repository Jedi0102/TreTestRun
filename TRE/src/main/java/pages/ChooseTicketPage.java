package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ChooseTicketPage {
    public SelenideElement firstOutboundFirstOption =$(By.xpath("(//img[@alt='chair'])[1]")),
    firstReturnOutboundFirstOption =$(By.xpath("(//img[@alt='chair'])[9]")),
    submitTicketButton =$(By.xpath("//p[contains(text(),'გაგრძელება')]"));


}
