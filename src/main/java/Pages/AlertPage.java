package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage extends BaseLibrary {

    public AlertPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#alerts\"]")
    public WebElement AlertEle;
    @FindBy(xpath = "//a[@href=\"#tab_12\"]")
    public WebElement AlertBtn;
    @FindBy(xpath = "//button[@onclick=\"myalert()\"]")
    public WebElement ClickMe1;
    @FindBy(xpath = "//button[@onclick=\"aftersec5()\"]")
    public WebElement ClickMe2;
    @FindBy(xpath = "//button[@onclick=\"myconfirm()\"]")
    public WebElement ClickMe3;
    @FindBy(xpath = "//button[@onclick=\"myprompt()\"]")
    public WebElement ClickMe4;


    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonElement(){waitforClick(AlertEle);}
    public void clickonAlertBtn(){waitforClick(AlertBtn);}
    public void clickonClickMe1(){
        waitforClick(ClickMe1);
        driver.switchTo().alert().accept();
    } public void clickonClickMe2(){
        waitforClick(ClickMe2);
        waitforAlert();
        driver.switchTo().alert().accept();
    }public void clickonClickMe3(){
        waitforClick(ClickMe3);
        driver.switchTo().alert().dismiss();
    }public void clickonClickMe4(){
        waitforClick(ClickMe4);
        driver.switchTo().alert().sendKeys("MOHIT SHARMA");
        driver.switchTo().alert().accept();
    }

}
