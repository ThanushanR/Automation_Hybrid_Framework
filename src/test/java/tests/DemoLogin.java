package tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import pages.DemoPage;
import testdata.DemoTestData;
import utils.TestBase;

public class DemoLogin extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(DemoLogin.class);

    @Test( priority = 0,dataProviderClass = DemoTestData.class,dataProvider = "DemoLogin")
    public void login(String username,String password ) {
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(DemoPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ username+" , Pasword: "+password);
        DemoPage.login(username,password);
        softAssert.assertAll();
    }

}
