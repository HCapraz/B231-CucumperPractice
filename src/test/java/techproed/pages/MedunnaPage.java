package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class MedunnaPage {

    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki ögeleri
     webdriver ile eslestirir, bu sayede classtaki webelemenetlere erismek icin @FindBy
     gibi PageFactory ye yardimci notasyonlar kullanilablir hale gelir
     */
    public MedunnaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "account-menu")
    public WebElement userIcon;
    @FindBy(id = "login-item")
    public WebElement signInOption;
    @FindBy(id = "username")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    //buraya kadar medunna sign in page seklinde ayri
    // class olusturmak daha güzel olur






}