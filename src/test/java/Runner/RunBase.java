package Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBase {
    static WebDriver driver;
    public enum Browser{CHROME, FIREFOX}

    public static WebDriver getDriver(){
        if (driver == null){
            return getDriver(Browser.CHROME);
        }else
            return driver;
    }

    public static WebDriver getDriver(Browser browser){
        if (driver != null){
            driver.quit();
        }

        switch (browser){
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Navegador não encontrado! Passe um navegador valido.");
        }
        if (driver != null){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }
}
