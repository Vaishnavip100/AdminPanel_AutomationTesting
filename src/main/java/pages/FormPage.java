package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

public class FormPage extends BasePage {
    private By pagesMenu=By.linkText("Pages");
    private By formsLink=By.linkText("Forms");
    private By htmlFormLink=By.linkText("HTML Form");

    private By username=By.name("username");
    private By password=By.name("password");
    private By comments=By.name("comments");

    private By dropdown=By.name("dropdown");
    private By radioButton=By.cssSelector("input[value='rd2']");
    private By checkbox=By.cssSelector("input[value='cb2']");

    private By submitBtn=By.cssSelector("input[type='submit']");
    private By resultText=By.tagName("body");
    
    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void openFormPage() {
        click(pagesMenu);
        click(formsLink);
        click(htmlFormLink);
    }

    public void enterUsername(String user) {
        type(username, user);
    }

    public void enterPassword(String pass) {
        type(password, pass);
    }

    public void enterComments(String text) {
        type(comments, text);
    }

    public void selectDropdown() {
        selectByValue(dropdown, "dd2");
    }

    public void selectRadio() {
        click(radioButton);
    }

    public void selectCheckbox() {
        click(checkbox);
    }

    public void submitForm() {
        click(submitBtn);
    }

    public String getResult() {
        return getText(resultText);
    }

    public void fillForm(String name, String email, String message) {
        enterUsername(name);
        enterPassword(email);    
        enterComments(message);

        selectDropdown();
        selectRadio();
        selectCheckbox();
    }

    public String getSuccessMessage() {
        return getResult();
    }
}