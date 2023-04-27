package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    WebElement NewCustBtn;

    @FindBy(name = "name")
    WebElement customerNamefld;

    @FindBy(name = "rad1")
    WebElement genderFld;

    @FindBy(name = "dob")
    WebElement dateOfBirthfld;

    @FindBy(name = "addr")
    WebElement addressfld;

    @FindBy(name = "city")
    WebElement CityFld;

    @FindBy(name = "state")
    WebElement StateFld;

    @FindBy(name = "pinno")
    WebElement PinFld;
    @FindBy(name = "telephoneno")
    WebElement MobileNumber;
    @FindBy(name = "emailid")
    WebElement emailfld;

    @FindBy(name = "password")
    WebElement passwordfld;

    @FindBy(name = "sub")
    WebElement submitBtn;

    @FindBy(xpath = "//*[@id='customer']/tbody/tr[4]/td[2]")
    WebElement customer_id;
    public NewCustomer(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewCustomerButton(){
        NewCustBtn.click();
    }
    public void filledName(String Name){
        customerNamefld.sendKeys(Name);
    }
    public void Gender(){
        genderFld.click();
    }
    public void Date(String DateOfBirth){
        dateOfBirthfld.sendKeys(DateOfBirth);
    }
    public void Address(String address){
        addressfld.sendKeys(address);
    }
    public void city(String City){
        CityFld.sendKeys(City);
    }
    public void State(String State){
        StateFld.sendKeys(State);
    }
    public void Pin(String Pin){
        PinFld.sendKeys(Pin);
    }
    public void Mobile(String Number){
        MobileNumber.sendKeys(Number);
    }
    public void Email(String Email){
        emailfld.sendKeys(Email);
    }
    public void FilledPassword(String password){
        passwordfld.sendKeys(password);
    }

    public String customerID(){
        return customer_id.getText();
    }
    public void clickSubBtn(){
        submitBtn.click();
    }
}
