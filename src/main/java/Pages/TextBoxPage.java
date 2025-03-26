package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import java.io.IOException;
import java.nio.file.WatchEvent;
import java.util.List;

public class TextBoxPage extends BaseLibrary {

public TextBoxPage(){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    public WebElement element;
    @FindBy(xpath = "//a[text()='text box']")
    public WebElement textbox;
    @FindBy(xpath = "//input[@id='fullname1']")
    public WebElement name;
    @FindBy(xpath = "//input[@id='fullemail1']")
    public WebElement email;
    @FindBy(xpath = "//textarea[@id='fulladdresh1']")
    public WebElement address;
    @FindBy(xpath = "//textarea[@id='paddresh1']")
    public WebElement peraddress;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submit;
    @FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
    public List<WebElement> list;

    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonElement(){waitforClick(element);}
    public void clickonTextBox(){waitforClick(textbox);}
    public void fillDetail()  {
        waitforSendKeys(name);
        name.sendKeys(GetReadFile(0,1,0));
        waitforSendKeys(email);
        email.sendKeys(GetReadFile(0,1,1));
        waitforSendKeys(address);
        address.sendKeys(GetReadFile(0,1,2));
        waitforSendKeys(peraddress);
        peraddress.sendKeys(GetReadFile(0,1,3));
    }
    public void submit(){
        waitforClick(submit);
    }

}
