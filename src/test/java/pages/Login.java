package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;
    @FindBy(name = "uid")
    WebElement userFld;

    @FindBy(name = "password")
    WebElement passwordFld;

    @FindBy(name = "btnLogin")
    WebElement loginButton;


    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void filledUserID(String userId){
        userFld.sendKeys(userId);
    }
    public void filledPassword(String password){
        passwordFld.sendKeys(password);
    }
    public Home loginBtnClick(){
        loginButton.click();

        return null;
    }
}
