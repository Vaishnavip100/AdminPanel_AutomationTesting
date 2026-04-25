package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPage;

public class DynamicTest extends BaseTest {

    //Hidden / Dynamic field becomes visible
    @Test
    public void dynamicContentLoaded() {
        DynamicPage dynamic=new DynamicPage(getDriver());
        dynamic.openAjaxPage();
        dynamic.clickAjaxButton();

        String url=dynamic.getCurrentURL();
        Assert.assertTrue(url.contains("ajax/submit"));
    }

    //Dynamic interaction result verification
    @Test
    public void dynamicInteractionResult() {
        DynamicPage dynamic=new DynamicPage(getDriver());
        dynamic.openAjaxPage();
        dynamic.clickAjaxButton();

        String pageSource=getDriver().getPageSource();
        Assert.assertTrue(pageSource.contains("Submitted Values"));
    }

    //Redirect validation
    @Test
    public void redirectFunctionality() {
        DynamicPage dynamic=new DynamicPage(getDriver());
        dynamic.openRedirectPage();

        String url=dynamic.getCurrentURL();
        Assert.assertTrue(url.contains("redirect"));
    }
}