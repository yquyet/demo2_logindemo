package tests;

import org.openqa.selenium.support.PageFactory;
import pages.OpenAccountPage;
import runner.TestRunner;

public class PageProvider {

    private static OpenAccountPage openAccountPage;

    public static OpenAccountPage getOpenAccountPage() {
        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
        }
        return openAccountPage;
    }


}
