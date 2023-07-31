package utility;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public void setUp(String url){
        WebDriverManager.chromedriver().setup();
        Configuration.timeout=10000;
        Configuration.screenshots=true;
        Configuration.savePageSource=false;

        WebDriverRunner.setWebDriver(new ChromeDriver());
        WebDriverRunner.getWebDriver().manage().window().maximize();
        open(url);


    }
    public void tearDown(){
        WebDriverRunner.closeWebDriver();
    }
}
