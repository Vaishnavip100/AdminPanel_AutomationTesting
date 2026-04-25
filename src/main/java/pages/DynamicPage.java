package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicPage extends BasePage {
    private By pagesMenu=By.linkText("Pages");
    private By formsMenu=By.linkText("Forms");
    private By ajaxLink=By.linkText("Ajax");

    private By navigationMenu=By.linkText("Navigation");
    private By redirectLink=By.linkText("JavaScript Redirects");
    
    private By ajaxButton=By.xpath("//input[@value='Code In It']");
    
    public DynamicPage(WebDriver driver) {
        super(driver);
    }

    public void openAjaxPage() {
        click(pagesMenu);
        click(formsMenu);
        click(ajaxLink);
    }

    public void clickAjaxButton() {
        click(ajaxButton);
    }

    public void openRedirectPage() {
        click(pagesMenu);
        click(navigationMenu);
        click(redirectLink);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}