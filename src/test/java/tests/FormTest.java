package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FormPage;
import utils.ExcelUtil;

public class FormTest extends BaseTest {

    @DataProvider(name="excelData")
    public Object[][] getFormData() {
        String path=System.getProperty("user.dir") + "/src/test/resources/testdata/FormData.xlsx";
        return ExcelUtil.getTestData(path, "Sheet1");
    }

    @Test(dataProvider="excelData")
    public void formSubmission(String name, String email, String message) {
        FormPage form=new FormPage(getDriver());
        form.openFormPage();
        form.fillForm(name, email, message);
        form.submitForm();

        String url=getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("submit")||url.contains("data"));
    }
}