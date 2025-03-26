import BaseLibrary.BaseLibrary;
import Pages.MenuPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MenuPageTest extends BaseLibrary {

    MenuPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new MenuPage();
    }
    @Test(priority = 1, groups = {"sanity","smoke","regression"})
    public void ClickOnClose() {
        ob.clickonClose();
    }
    @Test(priority = 2,groups = {"sanity","smoke","regression"})
    public void clickontext(){
        ob.clickonPractice();
    }
    @Test(priority = 3, groups = {"sanity","smoke","regression"})
    public void clickonWidget(){
        ob.clickonWidgetElem();
    }
    @Test(priority = 4,groups = {"regression"})
    public void clickonMenu(){
        ob.clickonMenu();
    }
    @Test(priority = 5,groups = {"regression"})
    public void HoverElem(){
        ob.hoverElement();
    }
}
