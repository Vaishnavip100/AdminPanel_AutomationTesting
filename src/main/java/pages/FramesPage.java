package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FramesPage extends BasePage {
    private By pagesMenu=By.linkText("Pages");
    private By embeddedMenu=By.linkText("Embedded Content");
    private By iframeLink=By.linkText("iFrames");
    
    private By iframe=By.tagName("iframe");
    private By mainText=By.tagName("h1");
    
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void openFramesPage() {
        click(pagesMenu);
        click(embeddedMenu);
        click(iframeLink);
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    public String getMainPageText() {
        return getText(mainText);
    }
    
    public void switchToIframe() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }

    public String getIframeText() {
        return driver.findElement(By.tagName("body")).getText();
    }
}