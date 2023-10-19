package Suporte;

import Runner.RunCucumberTeste;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTeste{

    //Cria Email Aleatório
    public static String getRandonEmail(){
        String email_inicial = "qazando_";
        String email_final = "@teste.com";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;
        return email_inicial + resultado + email_final;
    }
}
