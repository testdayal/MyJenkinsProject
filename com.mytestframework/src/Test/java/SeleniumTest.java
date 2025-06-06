import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SeleniumTest extends BaseTest{

    @Test public void pageNavigation() {
     getWebdriverManager().getDriver().get("https://developer.chrome.com/docs/chromedriver/capabilities");
    }
}
