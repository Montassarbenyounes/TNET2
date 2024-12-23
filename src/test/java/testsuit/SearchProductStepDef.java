package testsuit;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.SearchProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDef {

	@Given("acceder a la page daceeuil")
	public void acceder_a_la_page_daceeuil() {
	  Config.driver = new ChromeDriver();
	  Config.MaximizeWindow();
	  Config.driver.get("https://www.tunisianet.com.tn/");
	}

	@When("ecrire sur la bare de recherche {string} et cliquer sur rechercher")
	public void ecrire_sur_la_bare_de_recherche_et_cliquer_sur_rechercher(String Produit) {
	
	    SearchProductPage page = new SearchProductPage();
	    page.rechercheproduit(Produit);
	}

	
	@Then("verifier le resultat de recherche {string}")
	public void verifier_le_resultat_de_recherche(String expectedText) {
	   
	    SearchProductPage page = new SearchProductPage();
	    
	    
	}
}
	