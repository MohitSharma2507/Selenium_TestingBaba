package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buttonPage  extends BaseLibrary {

    public buttonPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    public WebElement element;
    @FindBy(xpath = "//a[@href=\"#tab_5\"]")
    public WebElement button;
    @FindBy(xpath = "//button[@ondblclick=\"doubletext()\"]")
    public WebElement doubleClickBtn;
    @FindBy(xpath = "//button[@id=\"noContextMenu\"]")
    public WebElement RightClickBtn;
    @FindBy(xpath = "//button[@onclick=\"clicktext()\"]")
    public WebElement OnlyClickBtn;


    public void clickonClose(){
        waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonElement(){waitforClick(element);}
    public void clickonButton(){waitforClick(button);}
    public void clickondoubleClickBtn(){Doubleclick(doubleClickBtn);}
    public void clickonRightclickBtn(){Rightlick(RightClickBtn);}
    public void clickonOnlyclickBtn(){Onlyclick(OnlyClickBtn);}
}
