package Pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SearchProductPage {

    @FindBy(id = "search_query_top")
    WebElement recherche;

    @FindBy(xpath = "/html/body/main/section/div/div/div[2]/section/p")
    WebElement verifrecherche;

    public SearchProductPage() {
        Config.attente(10);
        PageFactory.initElements(Config.driver, this);
    }


    public void rechercheproduit(String NomProd) {
        try {
            recherche.sendKeys(NomProd + Keys.ENTER);
            Config.attente(10);
        } catch (Exception e) {
            System.out.println("Erreur lors de la recherche du produit : " + e.getMessage());
        }
    }

   
    public void verifrechercheproduct(String titreproduit) {
        try {
            
            String actualText = verifrecherche.getText(); 
            Assert.assertEquals("Le produit affiché ne correspond pas au produit attendu !", titreproduit, actualText);
        } catch (Exception e) {
            System.out.println("Erreur lors de la vérification du produit : " + e.getMessage());
            e.printStackTrace();
        }
    
    }
}
