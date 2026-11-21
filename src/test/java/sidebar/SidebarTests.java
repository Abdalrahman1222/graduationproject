package sidebar;

import base.AuthenticatedBaseTest;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;

import java.util.List;

public class SidebarTests extends AuthenticatedBaseTest {

    @Test
    public void verifySidebarMenuItems() {

        DashboardPage dashboardPage = new DashboardPage(driver);

        Allure.step("Get sidebar menu items");
        List<String> actualMenuItems = dashboardPage.getSidebarMenuItems();

        List<String> expectedMenuItems = List.of(
                "Admin",
                "PIM",
                "Leave",
                "Time",
                "Recruitment",
                "My Info",
                "Performance",
                "Dashboard",
                "Directory"
        );

        Allure.step("Verify sidebar contains all expected menu items");
        Assert.assertTrue(
                actualMenuItems.containsAll(expectedMenuItems),
                "Sidebar menu is missing one or more expected items!"
        );
    }
}