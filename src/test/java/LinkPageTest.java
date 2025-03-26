import BaseLibrary.BaseLibrary;
import Pages.LinksPage;
import Pages.MenuPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinkPageTest extends BaseLibrary {

    LinksPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new LinksPage();
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
    public void clickonLink(){
        ob.clickonButton();
    }@Test(priority = 5)
    public void clickonDemoLink(){
        ob.clickonDemoLink();
    }@Test(priority = 6)
    public void clickoncloseAgain(){
        ob.clickonCloseAgain();
    }
}
