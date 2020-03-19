package run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/*Esta classe permite que a feature seja executada através do JUnit, 
podendo assim ser acompanhado a execucao e msg de erro que venha aparecer*/

@RunWith(Cucumber.class) //Permite a execucao da automacao pelo BDD
@CucumberOptions(
		features = "src/test/resources/features/", //Caminho para que as features existentes sejam executadas
		glue = { "" }, //Pode ser inserido tags antes dos cenários e c o Glue escolher quais cenários seráo executados de acordo com as tags
		monochrome = true,
		snippets = SnippetType.CAMELCASE, //permite gerar os steps automaticamente, para ligacao do codigo c BDD
		dryRun = false, 
		strict = false)

public class Run { //A class Run que irá executar a feature

}