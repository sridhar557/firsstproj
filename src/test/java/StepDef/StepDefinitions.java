package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
WebDriver driver;
    @Given("launch chrome browser")
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","C://Users//TECHOLUTION//OWASP ZAP//webdriver//windows//32//chromedriver.exe");
        driver=new ChromeDriver();

    }
    @When("tbh url is launched")
    public void URL(){
driver.get("https://brooklyn-dev.techolution.com/login");
    }

    @Then("Close browser")
    public void close(){
        driver.close();

    }
}
