package footer;

import base.AuthenticatedBaseTest;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class FooterTests extends AuthenticatedBaseTest {

    @Test
    public void verifyOrangeHRMFooterBrandingLink() {

        DashboardPage dashboardPage = new DashboardPage(driver);

        Allure.step("Scroll to the footer");
        dashboardPage.scrollToFooter();

        Allure.step("Verify footer text contains OrangeHRM, Inc");
        String footerText = dashboardPage.getFooterText();

        Assert.assertTrue(
                footerText.contains("OrangeHRM, Inc"),
                "Footer text does not contain OrangeHRM, Inc!"
        );

        Allure.step("Click the OrangeHRM, Inc link");
        dashboardPage.clickBrandingLink();

        String newTabUrl = dashboardPage.switchToNewTab();

        Allure.step("Verify new tab URL contains orangehrm.com");
        Assert.assertTrue(
                newTabUrl.contains("orangehrm.com"),
                "New tab URL does not contain orangehrm.com!"
        );
    }
}
