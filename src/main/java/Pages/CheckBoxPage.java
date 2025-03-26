package Pages;

import BaseLibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBoxPage extends BaseLibrary {
    public CheckBoxPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    public WebElement element;
    @FindBy(xpath = "//a[@href=\"#tab_2\"]")
    public WebElement CheckBox;
    @FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
    public WebElement frameBtn;
    @FindBy(xpath = "//input[@id=\"myCheck\"]")
    public WebElement Mobile;
    @FindBy(xpath = "//input[@id=\"mylaptop\"]")
    public WebElement laptop;
    @FindBy(xpath = "//input[@id=\"mydesktop\"]")
    public WebElement Desktop;
    @FindBy(xpath = "//h6[@id=\"text\"]")
    public WebElement validateMobile;
    @FindBy(xpath = "//h6[@id=\"text1\"]")
    public WebElement validateLaptop;
    @FindBy(xpath = "//h6[@id=\"text2\"]")
    public WebElement validateDesktop;

    public void clickonClose(){close.click();}
    public void clickonPractice(){practice.click();}
    public void clickonElement(){element.click();}
    public void clickonCheckBox(){
        CheckBox.click();
    }
    public void clickonMobile(){
    driver.switchTo().frame(frameBtn);
        Mobile.click();
    }
    public void validateMobile(){
        String text = validateMobile.getText();
        Assert.assertEquals(text,getReadData("mobile"));

    }
    public void clickonLaptop(){
        laptop.click();
    }
    public void validateLaptop(){
        String text = validateLaptop.getText();
        Assert.assertEquals(text,getReadData("Laptop"));
    }public void clickonDesk(){
        Desktop.click();
    }
    public void validateDesk(){
        String text = validateDesktop.getText();
        Assert.assertEquals(text,getReadData("Desktop"));
        driver.switchTo().defaultContent();
    }
}
