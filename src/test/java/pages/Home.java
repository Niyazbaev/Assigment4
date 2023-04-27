package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    WebDriver driver;

    @FindBy(className = "heading3")
    WebElement Head;


    public Home(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String expected(){

        return Head.getText();

    }
}
