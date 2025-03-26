package Pages;

import BaseLibrary.BaseLibrary;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class SelectMenuPage extends BaseLibrary {

    public SelectMenuPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[normalize-space()='×']")
    public WebElement close;
    @FindBy(xpath = "//a[text()='Practice']")
    public WebElement practice;
    @FindBy(xpath = "//button[@data-target=\"#widget\"]")
    public WebElement widgets;
    @FindBy(xpath = "//a[@href=\"#tab_24\"]")
    public WebElement selectMenu;
    @FindBy(xpath = "//label[text()=\"Select Value\"]//parent::div/select")
    public WebElement selectOptions ;


    public void clickonClose(){waitforClick(close);}
    public void clickonPractice(){waitforClick(practice);}
    public void clickonWidgetElem(){waitforClick(widgets);}
    public void clickonSelectMenu(){waitforClick(selectMenu);}
    public void clickonselectOption(){waitforClick(selectOptions);}
    public void setSelectvalyebyText()
    {
       seelctBytext(selectOptions,"Group 1, Option 2");
       List<String> list = Collections.singletonList(selectOptions.getText());
       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i)+", ");
       }
    }
    public void setSelectvalyebyIndex()
    {seelctByindex(selectOptions,2);
    }public void setSelectvalyebyValue()
    {seelctByvalue(selectOptions,"Group 2, Option 1");
    }
}
