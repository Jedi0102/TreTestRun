package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelectSeatInTrainPage {
    public ElementsCollection wagons = $$(By.xpath("//*[contains(@id, 'vagoni')]"));

    public SelenideElement
    chooseReturnButton =$(By.xpath("//p[contains(text(),'დაბრუნების არჩევა')]")),


    chooseButton =$(By.xpath("//p[contains(text(),'გაგრძელება')]"));
















}
