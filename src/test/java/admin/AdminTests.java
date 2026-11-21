package admin;

import base.AuthenticatedBaseTest;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;

public class AdminTests extends AuthenticatedBaseTest {

    @Test
    public void verifyAddUserPageFields() {

        AdminPage adminPage = new AdminPage(driver);

        Allure.step("Navigate to Admin > User Management > Users");
        adminPage.openUsersPage();

        Allure.step("Click Add");
        adminPage.clickAddButton();

        Allure.step("Verify User Role field is displayed");
        Assert.assertTrue(
                adminPage.isUserRoleDisplayed(),
                "User Role field is not displayed!"
        );

        Allure.step("Verify Employee Name field is displayed");
        Assert.assertTrue(
                adminPage.isEmployeeNameDisplayed(),
                "Employee Name field is not displayed!"
        );

        Allure.step("Verify Username field is displayed");
        Assert.assertTrue(
                adminPage.isUsernameDisplayed(),
                "Username field is not displayed!"
        );

        Allure.step("Verify Password field is displayed");
        Assert.assertTrue(
                adminPage.isPasswordDisplayed(),
                "Password field is not displayed!"
        );
    }
}