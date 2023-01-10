package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinition {
    @Given("kullanıcı google sayfasındadır")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("kullanıcı samsung kelimesini arar")
    public void kullaniciSamsungKelimesiniArar() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("samsung");

    }

    @Then("kullanıcı sayfada samsung kelimesi gectigini dogrular")
    public void kullaniciSayfadaSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();
    }


    @When("Kullanici cucumber kelimesini arar")
    public void kullaniciCucumberKelimesiniArar() {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("cucumber");
    }

    @Then("Kullanici sayfada cucumber kelimesi gectigini dogrular")
    public void kullaniciSayfadaCucumberKelimesiGectiginiDogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));

        Driver.closeDriver();
    }

    @When("Kullanici selenium kelimesini arar")
    public void kullaniciSeleniumKelimesiniArar() {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());

        sp.searchFor("selenium");
    }

    @Then("Kullanici sayfada selenium kelimesi gectigini dogrular")
    public void kullaniciSayfadaSeleniumKelimesiGectiginiDogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));

        Driver.closeDriver();
    }

}
