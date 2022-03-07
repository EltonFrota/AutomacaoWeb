package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	/*PADRÃO PAGEFATORY*/
	
	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(name = "txtPassword")
	private WebElement campoPassword;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	
	/*Metodos separados para validar cada campo*/
	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarBotao() {
		botaoLogin.click();
	}
	
	/*Todos o metodos em um so metodo*/
	public void realizarLogin(String usuario, String password) {
		informarCampoUsuario(usuario);
		informarCampoPassword(password);
		acionarBotao();
	}
}

