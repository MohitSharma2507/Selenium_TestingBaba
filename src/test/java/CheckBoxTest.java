import BaseLibrary.BaseLibrary;
import Pages.CheckBoxPage;
import Pages.buttonPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseLibrary {

        CheckBoxPage ob;

    @BeforeTest(groups = "regression")
    @Parameters("browser")
    public void LaunchURL(String BrowserName){
        Launch(BrowserName);
        ob = new CheckBoxPage();
    }
        @Test(priority = 1)
        public void ClickOnclose() throws InterruptedException {
            Thread.sleep(2000);
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
        public void ClickonCheckbox(){
            ob.clickonCheckBox();
        }
        @Test(priority = 5)
        public void clickOnMobile(){
            ob.clickonMobile();
        }@Test(priority = 6 )
        public void validate(){
            ob.validateMobile();
        }@Test(priority = 7)
        public void clickOnLaptop(){
            ob.clickonLaptop();
        }@Test(priority = 8 )
        public void validateLap(){
            ob.validateLaptop();
        }@Test(priority = 9)
        public void clickOnDesk(){
            ob.clickonDesk();
        }@Test(priority = 10 )
        public void validateDesk(){
            ob.validateDesk();
        }
    }