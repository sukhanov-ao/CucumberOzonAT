package CucumberOzon;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void beforeHook() {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Programs\\chromedriver_win32\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 6000;
        System.out.println("Тест начался");
    }

    @After
    public void afterHook() {
        System.out.println("Тест закончился");
        WebDriverRunner.closeWebDriver();
    }
}
