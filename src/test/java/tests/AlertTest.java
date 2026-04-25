package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertTest extends BaseTest {

    //Simple Alert - Accept
    @Test
    public void simpleAlertAccept() {
        AlertPage alert=new AlertPage(getDriver());
        alert.openAlertsPage();
        alert.triggerAlert();
        alert.acceptAlert();

        String result=alert.getAlertResult();
        Assert.assertTrue(result.contains("You triggered and handled the alert"));
    }

    //Confirm - Accept
    @Test
    public void confirmAccept() {
        AlertPage alert=new AlertPage(getDriver());
        alert.openAlertsPage();
        alert.triggerConfirm();
        alert.acceptAlert();

        String result=alert.getConfirmResult();
        Assert.assertTrue(result.contains("true"));
    }

    //Confirm - Dismiss
    @Test
    public void confirmDismiss() {
        AlertPage alert=new AlertPage(getDriver());
        alert.openAlertsPage();
        alert.triggerConfirm();
        alert.dismissAlert();

        String result=alert.getConfirmResult();
        Assert.assertTrue(result.contains("false"));
    }

    //Prompt - Enter Value
    @Test
    public void promptInput() {
        AlertPage alert=new AlertPage(getDriver());
        alert.openAlertsPage();
        alert.triggerPrompt();
        alert.enterTextInAlert("Vaishnavi");

        String result=alert.getPromptResult();
        Assert.assertTrue(result.contains("Vaishnavi"));
    }
}