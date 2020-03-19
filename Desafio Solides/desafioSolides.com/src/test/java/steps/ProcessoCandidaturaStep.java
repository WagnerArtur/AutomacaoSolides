package steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import driver.GeradorDrive;
import pageObject.ProcessoCandidaturaPageObject;

public class ProcessoCandidaturaStep extends GeradorDrive{

	//Instanciamento da classe PageObject que contém os métodos necessários para execucao/validacao do teste
	ProcessoCandidaturaPageObject usuario = PageFactory.initElements(getDriver(), ProcessoCandidaturaPageObject.class);
	
	//Estes @ Dado, E, entao, estao ligados ao BDD(feature), eles sao ligados atraves da mensagem de acao (em azul, dentro do "()")
	@Dado("^que o usuário está no site solides \"([^\"]*)\"$")
	public void que_o_usuário_está_no_site_solides(String url) {
		//o get é o comando que permite a insercao da URL no navegador 
		//getDriver permite que esta acao seja executada (pois faz parte da funcionalidade do Selenium)
		getDriver().get(url);
	}

	@Dado("^realiza uma busca por vaga \"([^\"]*)\"$")
	public void realiza_uma_busca_por_vaga(String palavra) throws InterruptedException {
		usuario.buscaVaga(palavra);
	}

	@Então("^realiza o login com a conta já criada$")
	public void realiza_o_login_com_a_conta_já_criada() {
		usuario.candidataVaga();
	}
	
	@Então("^verifica as informações para a vaga desejada$")
	public void verifica_as_informações_para_a_vaga_desejada() throws InterruptedException {
		usuario.validaCandidatura();
	}
	
	@Então("^confirma candidatura$")
	public void confirma_candidatura() throws InterruptedException {
		usuario.verificaCadastro();
		usuario.realizaLogOut();
		getDriver().close();
	  
	}
}