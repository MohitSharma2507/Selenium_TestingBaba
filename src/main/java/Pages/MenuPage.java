package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BaseLibrary {
    public MenuPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#widget\"]")
    public WebElement widgets;
    @FindBy(xpath = "//a[@href=\"#tab_23\"]")
    public WebElement menu;
    @FindBy(xpath = "//nav[@id=\"navbar\"]/ul/li[3]")
    public WebElement services;
    @FindBy(xpath = "//a[text()=\"Mobile Development\"]")
    public WebElement mobileDev;



    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonWidgetElem(){waitforClick(widgets);}
    public void clickonMenu(){waitforClick(menu);}
    public void hoverElement()
    {hovertoElem(services);
    waitforClick(mobileDev);
    }
}
