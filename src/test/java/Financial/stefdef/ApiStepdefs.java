package Financial.stefdef;

import Financial.service.ApiService;
import io.cucumber.java.en.*;

public class ApiStepdefs {
    ApiService apiStepdefs = new ApiService();

    @Given("user send  GET for the view home page")
    public void userSendGETForTheViewHomePage() {
        apiStepdefs.GETHomePage();
    }

    @When("user view home page")
    public void userViewHomePage() {
        apiStepdefs.GETHomePage();
    }

    @Given("user send POST to login")
    public void userSendPOSTToLogin() {
        apiStepdefs.UserAlreadyLogin();
    }

    @When("with password and username")
    public void withPasswordAndUsername() {
        apiStepdefs.UserAlreadyLogin();
    }

    @And("user redirect to {int}XX home page")
    public void userRedirectToXXHomePage(int arg0) {
        apiStepdefs.UserAlreadyLogin();
    }

    @When("user input invalid username or password")
    public void userInputInvalidUsernameOrPassword() {
        apiStepdefs.UserInvalidUsernameAndPassword();
    }

    @Given("user send POST to logout")
    public void userSendPOSTToLogout() {
        apiStepdefs.UserAlreadyLogin();
    }

    @When("user delete cookies session_id")
    public void userDeleteCookiesSession_id() {
        apiStepdefs.UserLogout();
    }



    @When("user redirect to {int}XX login page")
    public void userRedirectToXXLoginPage(int arg0) {
        apiStepdefs.UserAlreadyLogin();
    }
}
