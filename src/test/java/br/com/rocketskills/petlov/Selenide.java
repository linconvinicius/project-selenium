package br.com.rocketskills.petlov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

class PontoDoacao {
	String nome;
	String email;
	String cep;
	Integer numero;
	String complemento;
	String pets;

	public PontoDoacao(String nome, String email, String cep, Integer numero, String complemento, String pets) {
		this.nome = nome;
		this.email = email;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.pets = pets;
	}
}

class Selenide {

	private void submeteFormulario(PontoDoacao ponto) {
		$("input[placeholder='Nome do ponto de doação']").setValue(ponto.nome);
		$("input[name=email]").setValue(ponto.email);
		$("input[name=cep]").setValue(ponto.cep);
		$("input[value='Buscar CEP']").click();
		$("input[name='addressNumber']").setValue(ponto.numero.toString());
		$("input[name='addressDetails']").setValue(ponto.complemento);
		$(By.xpath("//span[text()=\"" + ponto.pets + "\"]/..")).click();
		$(".button-register").click();
	}

	private void acessarFormulario(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/lincongoncalves/Downloads/chromedriver-win64/chromedriver.exe");
		open("https://petlov.vercel.app/signup");
		$("h1").shouldHave(text("Cadastro de ponto de doação"));	
	}


	@Test
	@DisplayName("Deve poder cadastrar um ponto de doação")
	void caminhoFeliz() {

		//Pré-condições
		PontoDoacao ponto = new PontoDoacao(
			"Lincon point",
			"linconqa@teste.com.br",
			"05206180",
			296,
			"Casa 3",
			"Cachorros"
		);

		acessarFormulario();

		//Ação
		submeteFormulario(ponto);

		//Resultado esperado
		String target = "Seu ponto de doação foi adicionado com sucesso. Juntos, podemos criar um mundo onde todos os animais recebam o amor e cuidado que merecem.";
		$("#success-page p").shouldHave(text(target));
		
	}


	@Test
	@DisplayName(" Não deve cadastrar com email inválido")
	void emailIncorreto() {

		//Pré-condições
		PontoDoacao ponto = new PontoDoacao(
			"Point Pet",
			"incorreto&pointpet.com.br",
			"05206180",
			296,
			"Casa 3",
			"Gatos"
		);

		acessarFormulario();

		//Ação
		submeteFormulario(ponto);

		//Resultado esperado
		String target = "Informe um email válido";
		$(".alert-error").shouldHave(text(target));
	}
}
