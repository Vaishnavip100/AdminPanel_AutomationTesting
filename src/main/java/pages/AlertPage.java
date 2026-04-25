package pages;

import base.BasePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage {
    private By pagesMenu=By.linkText("Pages");
    private By basicsMenu=By.linkText("Basics");
    private By alertsLink=By.linkText("Alerts - JavaScript");

    private By alertButton=By.id("alertexamples");
    private By confirmButton=By.id("confirmexample");
    private By promptButton=By.id("promptexample");
    private By resultText=By.id("dialog-response");
    
    private By alertResult=By.id("alertexplanation");
    private By confirmResult=By.id("confirmexplanation");
    private By promptResult=By.id("promptreturn");
    
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        click(pagesMenu);
        click(basicsMenu);
        click(alertsLink);
    }

    public void clickAlert() {
        click(alertButton);
    }

    public void clickConfirm() {
        click(confirmButton);
    }

    public void clickPrompt() {
        click(promptButton);
    }

    public String getResult() {
        return getText(resultText);
    }
    
    public void acceptAlert() {
        switchToAlert().accept();
    }

    public void dismissAlert() {
        switchToAlert().dismiss();
    }

    public void enterTextInAlert(String text) {
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }
    
    public void triggerAlert() {
        click(alertButton);
    }

    public void triggerConfirm() {
        click(confirmButton);
    }

    public void triggerPrompt() {
        click(promptButton);
    }
    
    public String getResultText() {
        return getText(resultText);
    }
    
    public String getAlertResult() {
        return getText(alertResult);
    }
    
    public String getConfirmResult() {
        return getText(confirmResult);
    }

    public String getPromptResult() {
        return getText(promptResult);
    }
}