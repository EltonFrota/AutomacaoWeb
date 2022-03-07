package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

public class Utils {
	//cria��o do driver
	public static WebDriver driver;
	
	//cria��o do metodo para acessar o sistema
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");//Estou declarando onde esta o meu webDriver
		
		driver = new ChromeDriver();
		
		//Abrir a pagina maximizada
		driver.manage().window().maximize(); 
		
		//Tempo de espera de at� 5 segundos, para que a pagina carregue a cada execu��o.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Endere�o do site que vamos testar
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	/*Pra chamar mais facil */
	public static <T> T Na(Class<T> classe){
		return PageFactory.initElements(driver, classe);
	}
	
	/*Metodo pra gerar relat�rio*/
	public static void capturarTela(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
}
