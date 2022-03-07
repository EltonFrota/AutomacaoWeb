package stepsDefinitions;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	    Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String password) {
		Na(LoginPage.class).informarCampoPassword(password);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotao();
	}
	
	// Para este cenarios utilizei o Teste Caixa Preta fazendo uso da tabela de decisão
	/* 7 Casos de teste criado e 7 Casos de teste realizados, cobertura de 100% */
	
	@Entao("o sistema exibe a mensagem credenciais invalidas")
	public void oSistemaExibeAMensagemCredenciaisInvalidas() {
		//cenario: usuario e senha invalidos | usuario invalido e senha valida | usuario valido e senha invalida 
		//Validar a mensagem de credenciais invalidas quando deixar os campos em branco. Mensagem esperada "Invalid credentials"
		assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}
	
	@Entao("o sistema exibe a mensagem de usuario nao pode ficar vazio")
	public void oSistemaExibeAMensagemDeAvisoDeUsuarioNaoPodeFicarVazio() {
		//cenario: usuario e senha em branco
		//Validar a mensagem de alerta, quando deixar o campo username vazio. Mensagem esperada "Username cannot be empty"
		assertEquals("Username cannot be empty", driver.findElement(By.id("spanMessage")).getText());
	}	
	
	@Entao("o sistema exibe a mensagem de aviso de passwordo em branco")
	public void oSistemaExibeAMensagemDeAvisoDePasswordoEmBranco() {
		//cenario: senha em braco
		//Validar mensagem de alerta, quando o campo da senha ficar vazio. Mensagem esperada "Password cannot be empty"
		assertEquals("Password cannot be empty", driver.findElement(By.id("spanMessage")).getText());
	}

	@Entao("o sistema exibe a mensagem de aviso de usuario em branco")
	public void oSistemaExibeAMensagemDeAvisoDeUsuariodEmBranco() {
		//cenario: usuario em branco
		//Validar mensagem de alerta quando deixar o campo usuario em branco
		assertEquals("Username cannot be empty", driver.findElement(By.id("spanMessage")).getText());
	}
	
	
	@Entao("o sistema exibe a mensagem de usuario logado")
	public void oSistemaExibeAMensagemDeUsuarioLogado() {
		//cenario:
		//comando do Junit para validar se realmento o login foi realizado.
		assertEquals("Welcome Paul", driver.findElement(By.id("welcome")).getText());
	}
	
	
}
