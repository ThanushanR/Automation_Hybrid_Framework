package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static utils.PageBase.getDriver;

public class DemoPage {

    private static final Logger LOGGER = Logger.getLogger(DemoPage.class);

    private static By hdrLogin = By.id("logInPanelHeading");
    private static By txtUserName = By.id("txtUsername");
    private static By txtPassword = By.id("txtPassword");
    private static By btnLogin = By.id("btnLogin");
    private static By alert = By.id("spanMessage");

    public static boolean isLoginPageDisplay() {

        return getDriver().findElement(hdrLogin).isDisplayed();
    }

    public static void setUserName(String userName) {

        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isLoginAlertDisplay() {
        return getDriver().findElement(alert).isDisplayed();
    }

    public static String getLoginAlert() {
        return  getDriver().findElement(alert).getText();
    }
    public static void login(String userName, String password) {
        DemoPage.setUserName(userName);
        DemoPage.setPassword(password);
        DemoPage.clickLogin();
    }
}
