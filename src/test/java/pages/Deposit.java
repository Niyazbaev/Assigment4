package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[8]/a")
    WebElement dept;

    @FindBy(name = "accountno")
    WebElement accountNum;

    @FindBy(name = "ammount")
    WebElement amountNum;

    @FindBy(name = "desc")
    WebElement descrip;

    @FindBy(name = "AccSubmit")
    WebElement submitButton;

    public Deposit(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewDept(){
        dept.click();
    }

    public void FilledAccount(String AccountNumber){
        accountNum.sendKeys(AccountNumber);
    }
    public void FilledAmount(String Amount){
        amountNum.sendKeys(Amount);
    }
    public void clickSbmtBtn(){
        submitButton.click();
    }
    public void FilledDesc(String Description){
        descrip.sendKeys(Description);
    }
}
