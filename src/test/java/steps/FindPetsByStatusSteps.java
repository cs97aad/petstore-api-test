package steps;

import Pet.FindByStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class FindPetsByStatusSteps {


    @Given("I request to find pets by status as {string}")
    public void iRequestToFindPetsByStatusAs(String status) {
        FindByStatus.getPetsByStatus(status);
    }

    @When("the response status code is equal to {int}")
    public void theResponseStatusCodeIsEqualTo(int statusCode) {
        System.out.println("Expected status code " + statusCode);
        log.info("Using loggger- Expected status code " + statusCode);

        System.out.println("Actual status code " + FindByStatus.getStatusCode());
        log.info("Using loggger-Actual status code " + FindByStatus.getStatusCode());

        Assert.assertEquals(statusCode,FindByStatus.getStatusCode());

    }


    @Then("the response has pets with status {string} and name {string}")
    public void theResponseHasPetsWithStatusAndName(String status, String name) {
        Assert.assertTrue(FindByStatus.getPetsByNameAndStatus(status, name) > 1);
    }

}
