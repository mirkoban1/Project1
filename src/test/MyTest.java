import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyTest {
    @Given("^As not logged user$")
    public void asNotLoggedUser() {
    }

    @And("^on website https://www\\.phptravels\\.net/$")
    public void onWebsiteHttpsWwwPhptravelsNet() {
    }

    @When("^I click Contact$")
    public void iClickContact() {
    }

    @And("^Fill form with all necessary data$")
    public void fillFormWithAllNecessaryData() {

    }

    @And("^Choose proper Captcha code$")
    public void chooseProperCaptchaCode() {

    }

    @And("^Click \"([^\"]*)\"$")
    public void click(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I receive confirmation to previously filled mail address that form has been sent$")
    public void iReceiveConfirmationToPreviouslyFilledMailAddressThatFormHasBeenSent() {
    }

    @And("^I see confirmation on site that mail has been sent$")
    public void iSeeConfirmationOnSiteThatMailHasBeenSent() {
    }
}
