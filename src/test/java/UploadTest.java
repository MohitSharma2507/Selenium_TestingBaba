import BaseLibrary.BaseLibrary;
import Pages.TextBoxPage;
import Pages.UploadPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UploadTest extends BaseLibrary {

    UploadPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new UploadPage();
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
    public void clickonele(){
        ob.clickonElement();
    }
    @Test(priority = 4)
    public void clickonUploadElem(){
        ob.clickonUploadElem();
    }
    @Test(priority = 5)
    public void clickOnChooseFile(){ob.clickonChooseFile();}
    @Test(priority = 6)
    public void uploadAfile(){uploadaFile("C:\\Users\\dell\\IdeaProjects\\Selenium_TestingBaba\\src\\main\\java\\TestData\\ExcelData.xlsx");}
}
