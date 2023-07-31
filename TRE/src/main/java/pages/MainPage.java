package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.forMainPage.DataForDepartureTime;
import data.forMainPage.DataForReturnTime;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    DataForDepartureTime data = new DataForDepartureTime();
    DataForReturnTime returnData = new DataForReturnTime();
    public SelenideElement fromField =$(By.xpath("//div[@class='style__HomeFilterBox-sc-ek4s6p-1 iTbEUM']//div[@class='style__CitySelectionFrom-sc-l8bt9w-2 danKgy']")),
    locationsContainer =$(By.xpath("//div[@class='style__PopupCont-sc-c74shx-0 ejgLHn']")),

    toField =$(By.xpath(" //div[@class='style__HomeFilterBox-sc-ek4s6p-1 iTbEUM']//div[@class='style__CitySelectionTo-sc-khotwm-2 duYdet']")),
    destinationContainer =$(By.xpath("//div[@class='style__PopupCont-sc-nwsjnf-2 jVEolC']")),
    departureField =$(By.xpath("//div[@class='style__HomeFilterBox-sc-ek4s6p-1 iTbEUM']//div[@class='style__Departure-sc-1oi4v0a-0 kwcdXN']")),
    addReturnField =$(By.xpath("//div[@class='style__HomeFilterBox-sc-ek4s6p-1 iTbEUM']//div[@class='style__Return-sc-1oi4v0a-5 lerQbA']")),
    searchButton =$(By.xpath("//div[contains(@class,'style__HomeFilterBox-sc-ek4s6p-1 iTbEUM')]//div[contains(@class,'style__FilterSection-sc-1np62kc-0 bBuXfS')]//button[contains(@class,'Button__ButtonView-sc-obun0b-0 hsoAcB')]")),
    dateForDeparture =$(By.xpath("//div[@aria-label='"+data.departureTime+"']")),
    dateForReturn=$(By.xpath("//div[contains(@aria-label,'"+returnData.returnTime+"')]")),
    returnHeader=$(By.xpath("//div[@class='style__DataPickerHeader-sc-313ylx-5 SRioX']")),
    departureHeader =$(By.xpath("//div[@class='style__DataPickerHeader-sc-313ylx-5 SRioX']")),
    switchMonthsButton = $(By.xpath("//img[@src='/icons/monthIncrease.svg']")),
    switchMonthButtonForReturn =$(By.xpath("//img[@src='/icons/monthIncrease.svg']"));
    public ElementsCollection locations =locationsContainer.findAll(By.tagName("div")),
    destination =destinationContainer.findAll(By.tagName("div"));







}
