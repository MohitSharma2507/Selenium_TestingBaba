package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage  extends BaseLibrary {

    public LinksPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    public WebElement element;
    @FindBy(xpath = "//a[@href=\"#tab_6\"]")
    public WebElement Links;
    @FindBy(xpath = "//a[text()=\"Demo Page\"]")
    public WebElement DemoLink;

    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonElement(){waitforClick(element);}
    public void clickonButton(){waitforClick(Links);}
    public void clickonDemoLink(){waitforClick(DemoLink);}
    public void clickonCloseAgain() {
        switchtonewTab(1);
        waitforClick(close);
        switchtonewTab(0);
    }


}
