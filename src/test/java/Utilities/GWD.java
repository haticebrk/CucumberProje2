package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    // threadDriver.get() -> bulunduğum thread deki drierı verecek
    // threadDriver.set(driver) -> bulunduğum thread e driver set ediliyor

    public static WebDriver getDriver()
    {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");
        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if(threadBrowserName.get()==null)
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {


            switch (threadBrowserName.get())
            {
                case "firefox":
                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    threadDriver.set(new SafariDriver());
                    break;

                case "edge":
                    System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
                    WebDriverManager.edgedriver().setup();
                    threadDriver.set(new EdgeDriver());
                    break;
                default:
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
            }
        }

        return threadDriver.get();
    }

    public static void quitDriver()
    {
        try {
            Thread.sleep(5000); // ölmeyecek kullan
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null)  // dolu ise
        {
            threadDriver.get().quit();
            WebDriver driver=threadDriver.get(); driver =null;
            threadDriver.set(driver);
        }
    }

    public static void setThreadBrowserName(String browserName) {
        GWD.threadBrowserName.set(browserName);
    }




}
