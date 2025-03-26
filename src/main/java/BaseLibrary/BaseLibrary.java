package BaseLibrary;

import AppicationUtility.appicationUtility;
import ExcelUtility.ReadExcel;
import PropertyUtility.properyUitlity;
import ScreenShotUtility.ScreenShotUtility;
import WaitUtility.waitUtility;
import com.beust.ah.A;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

public class BaseLibrary implements ReadExcel, properyUitlity, waitUtility , appicationUtility, ScreenShotUtility {

    public static WebDriver driver = null;

    public void Launch(String BrowserName){

        if(BrowserName.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(BrowserName.equals("firefox") ){
            driver = new FirefoxDriver();
        }
        else if(BrowserName.equals("edge")){
            driver = new EdgeDriver();
        }
        driver.get("https://testingbaba.com/old");
        driver.manage().window().maximize();
    }

    public String GetReadFile(int sheet,int row,int col){

     String path = "C:\\Users\\dell\\IdeaProjects\\Selenium_TestingBaba\\src\\main\\TestData\\ExcelData.xlsx";
     String val ="";
    try {
      FileInputStream fis = new FileInputStream(path);
      XSSFWorkbook wb = new XSSFWorkbook(fis);
      XSSFSheet sheetNo = wb.getSheetAt(sheet);
      val = sheetNo.getRow(row).getCell(col).getStringCellValue();
     }
    catch (Exception e){
      System.out.println("Issues in this code : "+e);
     }
    return val;
     }
    @Override
    public String getReadData(String key)  {
        String path = "C:\\Users\\dell\\IdeaProjects\\Selenium_TestingBaba\\src\\main\\java\\TestData\\config.properties";
        String val = "";
    try {
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        val = prop.getProperty(key);
    }
    catch(Exception e){
        System.out.println("Issue in this code : "+e);
    }
        return val;
    }

    @Override
    public void waitforClick(WebElement ele) {

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
    }

    @Override
    public void waitforSendKeys(WebElement ele) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ele));
    }

    @Override
    public void waitforAlert() {
        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
    }

    @Override
    public void Doubleclick(WebElement ele) {
        Actions act = new Actions(driver);
        act.doubleClick(ele).perform();
    }

    @Override
    public void Rightlick(WebElement ele) {
        Actions act = new Actions(driver);
        act.contextClick(ele).perform();
    }

    @Override
    public void Onlyclick(WebElement ele) {
        Actions act = new Actions(driver);
        act.click(ele).perform();
    }

    @Override
    public void switchtonewTab(int tableNo) {

     Set<String> handle = driver.getWindowHandles();
     ArrayList<String> listOfHandles = new ArrayList<String>(handle);
     driver.switchTo().window(listOfHandles.get(tableNo));

    }

    @Override
    public void getScreenshot(String Foldername, String Filename) {
        String loc  = System.getProperty("user.dir");
        String path = loc + "//screenshot//" + Foldername + "//" + Filename + ".png";
        try{
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File des = new File(path);
            FileUtils.copyFile(src,des);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterMethod
    public void resultAnalysis(ITestResult result){
        if(result.getStatus()==ITestResult.SUCCESS){
           String MethodName = result.getMethod().getMethodName();
            getScreenshot("Pass",MethodName);
        }
        else if(result.getStatus()==ITestResult.FAILURE){
           String MethodName = result.getMethod().getMethodName();
            getScreenshot("Fail",MethodName);
        }
    }
    @Override
    public void uploadaFile(String FilePath) {

        StringSelection sel = new StringSelection(FilePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(sel,null);

        try {
            Robot rob = new Robot();
            rob.delay(250);
            rob.keyPress(KeyEvent.VK_CONTROL);
            rob.keyPress(KeyEvent.VK_V);
            rob.keyRelease(KeyEvent.VK_V);
            rob.keyRelease(KeyEvent.VK_CONTROL);
            rob.keyPress(KeyEvent.VK_ENTER);
            rob.delay(250);
            rob.keyRelease(KeyEvent.VK_ENTER);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void seelctBytext(WebElement ele, String text) {
        Select sel = new Select(ele);
        sel.selectByVisibleText(text);
    }

    @Override
    public void seelctByindex(WebElement ele, int index) {
        Select sel = new Select(ele);
        sel.selectByIndex(index);
    }

    @Override
    public void seelctByvalue(WebElement ele, String value) {
        Select sel = new Select(ele);
        sel.selectByValue(value);
    }

    @Override
    public void hovertoElem(WebElement ele) {
        Actions act = new Actions(driver);
        act.moveToElement(ele).build().perform();
    }
}