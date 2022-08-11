package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.QaToolsStep;

public class FormQaToolstepDefinitios {

    @Steps
    QaToolsStep page;

    @Given("the user is on the Qatools website")
    public void theUserIsOnTheQatoolsWebsite() {
        page.openQaToolsPage();
    }

    @When("you complete the form with the data {string}, {string}, {string}, {string}")
    public void youCompleteTheFormWithTheData(String name, String email, String CAddres, String PAddres) {
        page.completeForm(name, email, CAddres, PAddres);
        page.validateEmail(name, email, CAddres, PAddres);
    }

    @Then("you can check the response to the website")
    public void youCanCheckTheResponseToTheWebsite() {

    }


}
