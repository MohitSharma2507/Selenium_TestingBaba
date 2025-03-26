import BaseLibrary.BaseLibrary;
import Pages.CheckBoxPage;
import Pages.SelectMenuPage;
import Pages.TextBoxPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectMenuTest extends BaseLibrary {

    SelectMenuPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new SelectMenuPage();
    }
    @Test(priority = 1)
    public void ClickOnClose() {
        ob.clickonClose();
    }
    @Test(priority = 2)
    public void clickontext(){
        ob.clickonPractice();
    }
    @Test(priority = 3)
    public void clickonWidget(){
        ob.clickonWidgetElem();
    } @Test(priority = 4)
    public void clickonSelectMenu(){
        ob.clickonSelectMenu();
    }
    @Test(priority = 5)
    public void clickonSelectOptions(){
        ob.clickonselectOption();
    }
    @Test(priority = 6)
    public void selectValyebytext(){ob.setSelectvalyebyText();}
//    @Test(priority = 6)
//    public void selectValyebyIndex(){ob.setSelectvalyebyIndex();}
//    @Test(priority = 6)
//    public void setSelectbyvalue(){ob.setSelectvalyebyValue();
//    }
}

