import BaseLibrary.BaseLibrary;
import Pages.UploadPage;
import Pages.buttonPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ButtonPageTest extends BaseLibrary {
    buttonPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new buttonPage();
    }
    @Test(priority = 1)
    public void ClickOnclose() {
        ob.clickonClose();
    }
    @Test(priority = 2)
    public void clickontext(){
        ob.clickonPractice();
    }
    @Test(priority = 3)
    public void clickonele(){
        ob.clickonElement();
    }
    @Test(priority = 4)
    public void clickonbtn(){
        ob.clickonButton();
    }
    @Test(priority = 5)
    public void clickDoublebtn(){
        ob.clickondoubleClickBtn();
    }
    @Test(priority = 6)
    public void clickonRightbtn(){
        ob.clickonRightclickBtn();
    }
    @Test(priority = 7)
    public void clickonOnlybtn(){
        ob.clickonOnlyclickBtn();
    }
}