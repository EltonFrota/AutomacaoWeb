#language: pt
#enconding: UTF-8

@login
Funcionalidade: Login

@loginInvalido1
Cenario: usuario e senha invalidos
	Quando eu informar o usuario "ad"
	E informar a senha "asd"
	E clicar no botao login
	Entao o sistema exibe a mensagem credenciais invalidas

@loginInvalido2
Cenario: usuario e senha em branco
	Quando eu informar o usuario ""
	E informar a senha ""
	E clicar no botao login
	Entao o sistema exibe a mensagem de usuario nao pode ficar vazio
	
@loginInvalido3
Cenario: senha em braco
	Quando eu informar o usuario "Admin"
	E informar a senha ""
	E clicar no botao login
	Entao o sistema exibe a mensagem de aviso de passwordo em branco
	
@loginInvalido4
Cenario: usuario em branco
	Quando eu informar o usuario ""
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe a mensagem de aviso de usuario em branco

@loginInvalido5
Cenario: usuario invalido e senha valida
	Quando eu informar o usuario "admin123"
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe a mensagem credenciais invalidas

@loginInvalido6
Cenario: usuario valido e senha invalida
	Quando eu informar o usuario "Admin"
	E informar a senha "admin1233"
	E clicar no botao login
	Entao o sistema exibe a mensagem credenciais invalidas


@loginSucesso
Cenario: realizar login
	Quando eu informar o usuario "Admin"
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe a mensagem de usuario logado
