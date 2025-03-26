import BaseLibrary.BaseLibrary;
import Pages.MenuPage;
import Pages.TextBoxPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TextBoxTest extends BaseLibrary {

    TextBoxPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new TextBoxPage();
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
    public void clickontextbox(){
        ob.clickonTextBox();
    }
    @Test(priority = 5)
    public void filldetail(){ob.fillDetail();}
    @Test(priority = 6)
    public void submit(){ob.submit();}}