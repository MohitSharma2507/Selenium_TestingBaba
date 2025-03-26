package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramePage extends BaseLibrary {

    public NestedFramePage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    public WebElement element;
    @FindBy(xpath = "//button[@data-target=\"#alerts\"]")
    public WebElement FrameEle;
    @FindBy(xpath = "//a[@href=\"#tab_14\"]")
    public WebElement FrameBtn;
    @FindBy(xpath = "//iframe[@src=\"target1.html\"]")
    public WebElement Frame1;
    @FindBy(xpath = "//iframe[@src=\"text.html\"]")
    public WebElement Frame2;
    @FindBy(xpath = "//iframe[@src=\"example.html\"]")
    public WebElement Frame3;
    @FindBy(xpath = "//a[@href=\"text1.html\"]")
    public WebElement clickHere;

    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonElement(){waitforClick(FrameEle);}
    public void clickonFrameBtn(){waitforClick(FrameBtn);}
    public void VerifyclickHere(){
        driver.switchTo().frame(Frame1);
        driver.switchTo().frame(Frame2);
        driver.switchTo().frame(Frame3);
        waitforClick(clickHere);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
    }
}
