package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {


    @Given("Smoke test icin hazırlıklar yapıldı")
    public void smokeTestIcinHazırlıklarYapıldı() {
    }

    @When("Smoke test calıstıgında")
    public void smokeTestCalıstıgında() {
        System.out.println("Smoke test calisti");
    }

    @Then("Smoke test basarılı olmalı")
    public void smokeTestBasarılıOlmalı() {
    }

    @Given("Regression test icin hazırlıklar yapıldı")
    public void regressionTestIcinHazırlıklarYapıldı() {
    }

    @When("Regression test calıstırıldıgında")
    public void regressionTestCalıstırıldıgında() {
        System.out.println("Regression test calisti");
    }

    @Then("Regression test basarılı olmalı")
    public void regressionTestBasarılıOlmalı() {
    }
}
