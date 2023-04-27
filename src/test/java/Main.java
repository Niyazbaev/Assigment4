import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;



public class Main{
    WebDriver driver;
    String customer_id;
    String account_id;
    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test()
    public void LoginPage() {
        driver.get("https://demo.guru99.com/v4/index.php");
        Login loginPage = new Login(driver);
        loginPage.filledUserID("mngr481320");
        loginPage.filledPassword("hatyteg");
        loginPage.loginBtnClick();

    }
    @Test(priority = 1)
    public void HomePage(){
        Home homepage = new Home(driver);
        Assert.assertEquals(homepage.expected(), "Welcome To Manager's Page of Guru99 Bank");
    }
    @Test(priority = 2)
    public void NewCustomerPage(){
        NewCustomer newCustomerPage = new NewCustomer(driver);
        newCustomerPage.NewCustomerButton();
        driver.switchTo().defaultContent();
        newCustomerPage.filledName("Baiken");
        newCustomerPage.Gender();
        newCustomerPage.Date("07052003");
        newCustomerPage.Address("Zhetysu 4 24");
        newCustomerPage.city("Almaty");
        newCustomerPage.State("Kazakhstan");
        newCustomerPage.Pin("160001");
        newCustomerPage.Mobile("87477030507");
        newCustomerPage.Email("rtrteer@gmail.com");
        newCustomerPage.FilledPassword("Baiken20030");
        newCustomerPage.clickSubBtn();
        customer_id = newCustomerPage.customerID();
    }
    @Test(priority = 3)
    public void NewAccountPage(){
        NewAccount newaccountpage = new NewAccount(driver);
        newaccountpage.NewAccButton();
        newaccountpage.filledCustomerId(customer_id);
        newaccountpage.FilledDept("2500");
        newaccountpage.clickSubmitBtn();
        account_id = newaccountpage.accID();
    }
    @Test(priority = 4)
    public void DepositPage(){
        Deposit depositpage = new Deposit(driver);
        depositpage.NewDept();
        depositpage.FilledAccount(account_id);
        depositpage.FilledAmount("13000");
        depositpage.FilledDesc("Something there!");
        depositpage.clickSbmtBtn();
    }
}