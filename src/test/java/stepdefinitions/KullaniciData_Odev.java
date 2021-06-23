package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.KullaniciDataPage_Odev;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class KullaniciData_Odev {
KullaniciDataPage_Odev kullaniciDataPage_odev=new KullaniciDataPage_Odev();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String sayfaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("editor_datatables_url"));
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() throws InterruptedException {

kullaniciDataPage_odev.newbtn.click();
Thread.sleep(3000);
    }

    @Then("tum bilgileri girer")
    public void tum_bilgileri_girer() {
        Actions actions = new Actions(Driver.getDriver());
        kullaniciDataPage_odev.firstName.sendKeys(ConfigReader.getProperty("editor_data_first_name"));
        actions.click(kullaniciDataPage_odev.firstName).
                //sendKeys(ConfigReader.getProperty("editor_data_first_name")).
                        sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_last_name")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_position")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_office")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_extension")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_start_date")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("editor_data_salary")).
                perform();
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() throws InterruptedException {
        Thread.sleep(2000);
kullaniciDataPage_odev.createButton.click();
    }

    @When("kullanici ilk isim ile arama yapar")
    public void kullanici_ilk_isim_ile_arama_yapar() {
kullaniciDataPage_odev.search.sendKeys("Jahan");
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isim_bolumunde_isminin_oldugunu_dogrular() {
        Assert.assertTrue(kullaniciDataPage_odev.dogrulama.getText().contains("Jahan"));
    }

}
