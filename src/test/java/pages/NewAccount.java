package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
    WebElement NewAccBtn;

    @FindBy(name = "cusid")
    WebElement customerId;

    @FindBy(name = "selaccount")
    WebElement AccountType;

    @FindBy(name = "inideposit")
    WebElement InitialDept;

    @FindBy(name = "button2")
    WebElement submitBtn;

    @FindBy(xpath = "//*[@id='account']/tbody/tr[4]/td[2]")
    WebElement account_id;

    public NewAccount(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewAccButton(){
        NewAccBtn.click();
    }

    public void filledCustomerId(String customerID){
        customerId.sendKeys(customerID);
    }
    public void FilledDept(String Dept){
        InitialDept.sendKeys(Dept);
    }
    public void clickSubmitBtn(){
        submitBtn.click();
    }

    public String accID(){
        return account_id.getText();
    }
}
