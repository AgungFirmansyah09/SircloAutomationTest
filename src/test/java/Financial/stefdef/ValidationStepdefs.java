package Financial.stefdef;

import io.cucumber.java.en.Then;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ValidationStepdefs {

    @Then("response status code should be {int}")
    public void responseStatusCodeShouldBe(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
