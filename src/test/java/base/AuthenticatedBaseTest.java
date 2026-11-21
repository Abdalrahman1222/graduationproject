package base;

import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class AuthenticatedBaseTest extends BaseTests {

    @BeforeMethod(alwaysRun = true)
    public void loginBeforeTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }
}