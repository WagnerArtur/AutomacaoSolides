package pageObject;

import elemento.Elemento;
import elemento.Usuario;

public class ProcessoCandidaturaPageObject extends Elemento {

	public void buscaVaga(String palavra) throws InterruptedException {
		//Usuario - classe que contém acoes do selenium, tipo sendkeys que preenche, click que clica/seleciona um botao, etc
		//após o usuario, temos a acao que ele realiza
		//dentro do "()" foi passado a constante (seletor inspecionado) e em alguns casos os atributos
		
		Usuario.preencheCampo(CAMPO_PESQUISA, palavra); Thread.sleep(1000);
		Usuario.seleciona(BOTAO_PESQUISA); Thread.sleep(1000);
		Usuario.valida(VALIDA_RESULTADO, palavra); Thread.sleep(1000);
		Usuario.seleciona(BOTAO_CANDIDATESE); Thread.sleep(1000);
	}

	public void candidataVaga() {
		Usuario.seleciona(BOTAO_CANDIDATESE_VAGA);
		Usuario.preencheCampo(CAMPO_EMAIL, "wagnerdix@gmail.com");
		Usuario.preencheCampo(CAMPO_SENHA, "automacao"); 
		Usuario.seleciona(BOTAO_LOGIN);
	}

	public void validaCandidatura() throws InterruptedException {
		Usuario.valida(VALIDA_CANDIDATURA, "VAGA");
	}
	
	public void verificaCadastro() throws InterruptedException {
		Thread.sleep(2000);
		Usuario.seleciona(MINHAS_APLICACOES);
		Usuario.valida(VERIFICA_CADASTRO, "teste");
	}
	
	public void realizaLogOut() {
		Usuario.seleciona(MEU_LOGIN);
		Usuario.seleciona(SAIR);
		
	}

}
