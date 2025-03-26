package WaitUtility;

import org.openqa.selenium.WebElement;

public interface waitUtility {

    public void waitforClick(WebElement ele);
    public void waitforSendKeys(WebElement ele);
    public void waitforAlert();
}
