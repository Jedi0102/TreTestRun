package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactUserDetailsPage {
    public SelenideElement userEmail =$(By.xpath("//input[@name='EmailAddress']")),
    userPhoneNumber =$(By.xpath("//input[@name='PhoneNumber']")),
    userContactSubmitButton =$(By.xpath("(//button[@class='Button__ButtonView-sc-obun0b-0 hsoAcB'])[3]"));

}
