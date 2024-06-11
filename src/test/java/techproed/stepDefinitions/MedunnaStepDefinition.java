package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.MedunnaPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class MedunnaStepDefinition {
    MedunnaPage medunnaPage = new MedunnaPage();

    @Given("the user navigates to the {string} website")
    public void theUserNavigatesToTheWebsite(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("the user clicks on the user icon")
    public void theUserClicksOnTheUserIcon() {

        medunnaPage.userIcon.click();
    }

    @And("clicks on the sign in option")
    public void clicksOnTheSignInOption() {

        medunnaPage.signInOption.click();
    }

    @And("enters the username in the username field")
    public void entersTheUsernameInTheUsernameField() {

        medunnaPage.usernameInput.sendKeys(ConfigReader.getProperty("MedunnaUsername"));
    }

    @And("enters the password in the password field")
    public void entersThePasswordInThePasswordField() {

        medunnaPage.passwordInput.sendKeys(ConfigReader.getProperty("MedunnaPassword"));
    }

    @And("clicks on the sign in button")
    public void clicksOnTheSignInButton() {

        medunnaPage.signInSubmitButton.click();
    }

    @And("clicks on the Items and Titles option")
    public void clicksOnTheItemsAndTitlesOption() {

    }

    @And("clicks on the room option")
    public void clicksOnTheRoomOption() {
    }

    @And("click on the Create a new room button")
    public void clickOnTheCreateANewRoomButton() {
    }

    @And("enters a room number in the room number field")
    public void entersARoomNumberInTheRoomNumberField() {
    }

    @And("selects SUITE from the room type menu")
    public void selectsSUITEFromTheRoomTypeMenu() {
    }

    @And("clicks on the status checkbox")
    public void clicksOnTheStatusCheckbox() {
    }

    @And("enters {string} in the Price field")
    public void entersInThePriceField(String arg0) {
    }

    @And("enters a {string} in the Description field")
    public void entersAInTheDescriptionField(String arg0) {
    }

    @And("clicks on the save button")
    public void clicksOnTheSaveButton() {
    }

    @Then("verify A new Room is created succesfully")
    public void verifyANewRoomIsCreatedSuccesfully() {
    }

    @And("closes the application")
    public void closesTheApplication() {

    }
}
