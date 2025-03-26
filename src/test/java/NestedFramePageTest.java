import BaseLibrary.BaseLibrary;
import Pages.NestedFramePage;
import Pages.SelectMenuPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NestedFramePageTest extends BaseLibrary {

    NestedFramePage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new NestedFramePage();
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
    public void clickonele() {
        ob.clickonElement();
    }
    @Test(priority = 4)
    public void clickonFrame() {
        ob.clickonFrameBtn();
    }
    @Test(priority = 5)
    public void clickonNested() {
        ob.VerifyclickHere();
    }
}
