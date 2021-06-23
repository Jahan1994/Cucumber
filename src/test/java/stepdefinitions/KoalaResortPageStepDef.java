package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaResortPageStepDef {
    KoalaResortPage koalaResortPage=new KoalaResortPage();
    @Given("kullanici {string} Hotels ana sayfasinda")
    public void kullanici_hotels_ana_sayfasinda(String kr_url) {
Driver.getDriver().get(ConfigReader.getProperty("kr_url"));
    }

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
  koalaResortPage.login.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
       koalaResortPage.username.sendKeys(ConfigReader.getProperty("kr_valid_username"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
       koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
koalaResortPage.loginButton.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
Assert.assertEquals(ConfigReader.getProperty("kr_basarili_giris_url"),Driver.getDriver().getCurrentUrl());
    }
    @Then("kulllanici sayfayi kapatir")
    public void kulllanici_sayfayi_kapatir() {
Driver.closeDriver();
    }
    @Then("kullanici ismi olarak {string} girer")
    public void kullanici_ismi_olarak_girer(String username) {
koalaResortPage.username.sendKeys(ConfigReader.getProperty("kr_wrong_username"));
    }


    @Then("kullanici sifresi olarak {string} girer")
    public void kullanici_sifresi_olarak_girer(String password) {
koalaResortPage.password.sendKeys(ConfigReader.getProperty("kr_wrong_password"));
    }
    @Then("sayfaya giris yapamadigini kontrol eder")
    public void sayfaya_giris_yapamadigini_kontrol_eder() {
Assert.assertTrue(koalaResortPage.loginError.isDisplayed());

    }
    }