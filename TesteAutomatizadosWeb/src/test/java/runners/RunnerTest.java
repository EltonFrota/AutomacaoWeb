package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*Pretty = gera um relat�rio no console, do que o cumcuber esta fazendo*/
		/*"html:target/cucumber-report" - Gera um relat�rio completo dos teste*/
		plugin = {"pretty", "html:target/cucumber-report"},
		
		features="src/test/resources/features",
		glue = "stepsDefinitions",
		
		/*Tags - Serve pra executar um cen�rio especifico*/
		tags = "@loginSucesso",
		
		/*SnippetType.CAMELCASE - Faz a separa��o das palavras com letras maiusculas*/
		snippets = SnippetType.CAMELCASE,
		
		/*Deixa as letras do console brancas, mais facil de ler*/
		monochrome = true,
		
		/*dryRun = true - Cria as estruturas(os passos) do cumcuber que est�o faltando 
		 * sem executar o navegador*/
		dryRun = false
		)


public class RunnerTest {
	

}
