package elemento;

import org.junit.Assert;
import org.openqa.selenium.By;

import driver.GeradorDrive;

public class Usuario extends GeradorDrive {

	//Esta classe contém as funcoes basicas que o usuario executa, como, preencher o campo, clicando no botao, comparando msg
	public static void preencheCampo(String css, String palavra) {
		getDriver().findElement(By.cssSelector(css)).sendKeys(palavra); //sendKeys - preenche o campo
	}

	public static void seleciona(String css) {
		getDriver().findElement(By.cssSelector(css)).click();
	}
	
	public static String valida(String css, String esperado) throws InterruptedException {
		
		Thread.sleep(2000);//Tempo pausa na execucao - tempo em que a msg já está disponível
		String resultadoEsperado = esperado; //recebe o valor esperado - eu informo um trecho (palavra) do texto
		String resultadoObtido = captaText(css); //recebe o valor obtido - é captado no sistema através do getText
		Assert.assertTrue(resultadoObtido.toLowerCase().contains(resultadoEsperado.toLowerCase())); //compara os resultados por parte do texto 
		return resultadoObtido;
	}
	
	public static String captaText(String css) {
		return getDriver().findElement(By.cssSelector(css)).getText(); //responsavel por captar texto
	}

}
