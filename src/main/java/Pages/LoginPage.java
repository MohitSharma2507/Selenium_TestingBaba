package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BaseLibrary {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;

    public void clickonClose(){
        close.click();
    }

    public void getTitle(){
        System.out.println(driver.getTitle());
    }
}