package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepsDefinitions {
    @Given("Kullanici google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
    }

    @When("Kullanici arama kutusuna {string} yazip arattiginda")
    public void kullaniciAramaKutusunaYazipArattiginda(String key) {
        GoogleSearchPage sp= new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);

    }

    @Then("Kullanici tittle da {string} gormelidir")
    public void kullaniciTittleDaGormelidir(String key) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
    }
}
