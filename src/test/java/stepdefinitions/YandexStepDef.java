package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;


public class YandexStepDef {
YandexPage yandexPage=new YandexPage();
    @Given("User use navigate for going Yandex")
    public void user_use_navigate_for_going_yandex() {
        Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }

    @When("User search for iPhone in Yandex")
    public void user_search_for_i_phone_in_yandex() {
yandexPage.searchBox.sendKeys("iPhone"+ Keys.ENTER);

    }

    @Then("User verify result has a iPhone")
    public void user_verify_result_has_a_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }

    @When("User search for Teapot in Yandex")
    public void user_search_for_teapot_in_yandex() {
yandexPage.searchBox.sendKeys("Teapot"+Keys.ENTER);
    }

    @Then("User verify result has a Teapot")
    public void user_verify_result_has_a_teapot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Teapot"));

    }

    @And("User close the window")
    public void userCloseTheWindow() {
        Driver.closeDriver();
    }
}