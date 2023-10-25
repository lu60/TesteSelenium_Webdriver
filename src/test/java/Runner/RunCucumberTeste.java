package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static java.sql.DriverManager.getDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/relatorio_cenario_@login.json", "html:target/reports/"},
        features = {"classpath:/features"},
        glue = {"Steps"},
        tags = {"@login"}
)
public class RunCucumberTeste extends RunBase {

    @AfterClass
    public static void finaliza() {
        getDriver().quit();
    }
}
