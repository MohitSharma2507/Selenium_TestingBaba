import BaseLibrary.BaseLibrary;
import Pages.AlertPage;
import Pages.NestedFramePage;
import Pages.buttonPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AlertPageTest extends BaseLibrary {

    AlertPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new AlertPage();
    }
@Test(priority = 1)
public void ClickOnclose() throws InterruptedException {
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
    ob.clickonAlertBtn();
}
@Test(priority = 5)
public void clickonClickme1(){
    ob.clickonClickMe1();
}
@Test(priority = 6)
public void clickonClickme2(){
    ob.clickonClickMe2();
}
@Test(priority = 7)
public void clickonClickme3(){
    ob.clickonClickMe3();
}
@Test(priority = 8)
public void clickonClickme4(){
    ob.clickonClickMe4();
}
}

