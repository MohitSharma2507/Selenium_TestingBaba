package AppicationUtility;

import org.openqa.selenium.WebElement;

public interface appicationUtility {

    public void Doubleclick(WebElement ele);
    public void Rightlick(WebElement ele);
    public void Onlyclick(WebElement ele);
    public void switchtonewTab(int tableNo);
    public void uploadaFile(String FilePath);
    public void seelctBytext(WebElement ele,String text);
    public void seelctByindex(WebElement ele,int index);
    public void seelctByvalue(WebElement ele,String value);
    public void hovertoElem(WebElement ele);
}
