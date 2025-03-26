package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadPage extends BaseLibrary {

    public UploadPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    public WebElement element;
    @FindBy(xpath = "//a[@href=\"#tab_8\"]")
    public WebElement Upload;
    @FindBy(xpath = "//input[@id=\"File1\"]")
    public WebElement choose;

    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonElement(){waitforClick(element);}
    public void clickonUploadElem(){waitforClick(Upload);}
    public void clickonChooseFile(){Onlyclick(choose);}
}
