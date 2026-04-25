package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;

public class FramesTest extends BaseTest {

    //Switch to iframe
    @Test
    public void switchToIframe() {
        FramesPage frame=new FramesPage(getDriver());
        frame.openFramesPage();
        frame.switchToIframe();

        String text=frame.getIframeText();
        Assert.assertTrue(text.length() > 0);
    }

    //Verify content inside iframe
    @Test
    public void iframeContent() {
        FramesPage frame=new FramesPage(getDriver());
        frame.openFramesPage();
        frame.switchToIframe();

        String text=frame.getIframeText();
        Assert.assertFalse(text.isEmpty());
    }

    //Switch back to main page
    @Test
    public void switchBackToMainPage() {
        FramesPage frame=new FramesPage(getDriver());
        frame.openFramesPage();
        frame.switchToIframe();
        frame.switchToDefault();

        String text=frame.getMainPageText();
        Assert.assertTrue(text.contains("iFrames"));
    }
}