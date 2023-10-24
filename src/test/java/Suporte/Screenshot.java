package Suporte;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import static Runner.RunBase.getDriver;

public class Screenshot {
    public static void addScreenshotOnSecenario(Scenario cenario){
        System.out.println("===============");
        System.out.println("Teste executado: " + cenario.getName());
        System.out.println("Status: " +cenario.getStatus());
        System.out.println("Tag: " + cenario.getSourceTagNames());
        System.out.println("===============");

        //tira um printscreen quando cenário falhar
        if (cenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            cenario.embed(screenshot, "image/png");
        }
    }
}
