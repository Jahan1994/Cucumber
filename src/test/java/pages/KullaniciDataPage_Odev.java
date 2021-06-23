package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KullaniciDataPage_Odev {
    public KullaniciDataPage_Odev(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newbtn;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;
    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;
    @FindBy(xpath = "//tbody//tr")
    public WebElement dogrulama;
}
