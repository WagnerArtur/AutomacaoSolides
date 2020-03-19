package elemento;

public class Elemento {
	
	//Elementos constantes que contém como seu valor o inspecionamento (ccsSelector) de campos, botoes e mensagens 
	//O final significa justamente a constante de cada um deles

	public static final String CAMPO_PESQUISA = "#busca_form > div > div.col-sm-5 > div > input";
	public static final String BOTAO_PESQUISA = "#realiza_busca > i";
	public static final String VALIDA_RESULTADO = "body > section.find-job.section > div > div > div > div:nth-child(1) > div > h4 > a";
	public static final String BOTAO_CANDIDATESE = "body > section.find-job.section > div > div > div > div:nth-child(1) > div > div > div.pull-right > a.btn.btn-common.btn-rm";
	public static final String BOTAO_CANDIDATESE_VAGA = "body > section > div > div > div > div > div > div.clearfix > div.col-md-6.text-right-j.mobile-hidden > a";
	public static final String CAMPO_EMAIL = "#user-email";
	public static final String CAMPO_SENHA = "#senha";
	public static final String BOTAO_LOGIN = "#login";
	public static final String VALIDA_CANDIDATURA = "#edita-section > div > ul > li:nth-child(4)";
	public static final String MINHAS_APLICACOES = "#edita-section > div > div > center > strong:nth-child(2) > a";
	public static final String VERIFICA_CADASTRO = "#edita-section > div > div > div > div.col-md-5 > h3";
	public static final String MEU_LOGIN = "#navbar > ul > li > a";
	public static final String SAIR = "#navbar > ul > li > ul > li.right-4 > a";
}