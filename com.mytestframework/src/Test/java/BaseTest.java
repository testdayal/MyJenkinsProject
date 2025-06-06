import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public static WebdriverManager webdriverManager=new WebdriverManager();

    public static WebdriverManager getWebdriverManager() {
        return webdriverManager;
    }

    public static void setWebdriverManager(WebdriverManager webdriverManager) {
        BaseTest.webdriverManager = webdriverManager;
    }
    @AfterTest(alwaysRun = true)
    public void closeBrowser(){
        getWebdriverManager().getDriver().close();
    }

    @BeforeSuite
    public void initializeBrowser(){
        System.out.println("Initialize-Browser");
        getWebdriverManager().getBrowserConfiguration("chrome");
    }
}
