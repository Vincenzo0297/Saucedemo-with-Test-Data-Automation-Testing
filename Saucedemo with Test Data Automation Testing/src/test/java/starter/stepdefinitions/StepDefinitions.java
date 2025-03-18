package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import starter.UilityFunctions.CSVDataReader;
import starter.UilityFunctions.WaitSeconds;
import starter.navigation.NavigateTo;
import starter.saucedemo.saucedemoPath;
import starter.saucedemo.saucedemoActions;
import java.util.List;

public class StepDefinitions {

    @Given("{actor} is at the saucedemo page")
    public void SauceDemoPage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.SauceDemoPage(),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter username {string}")
    public void userEnterUsername(Actor actor, String userName) {
        actor.attemptsTo(
                saucedemoActions.enterUserName(CSVDataReader.actor(userName)), // ✅ Updated method name
                WaitSeconds.Now()
        );
    }

    @And("{actor} enter password {string}")
    public void userEnterPassword(Actor actor, String Password) {
        actor.attemptsTo(
                saucedemoActions.enterPassword(CSVDataReader.actor(Password)), // ✅ Corrected method
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the login button")
    public void userClickOnTheLoginButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_LOGIN_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} select their option {string}")
    public void userSelectTheirOptionOptions(Actor actor, String Options) {
        actor.attemptsTo(
                saucedemoActions.selectOptions(CSVDataReader.actor(Options)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the cart button")
    public void userClickOnTheCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_CART_BUTTON)
        );
    }

    @And("{actor} click on the cart icon to proceed")
    public void userClickOnTheCartIconToProceed(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_CART_ICON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on checkout button")
    public void userClickOnCheckoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_CHECKOUT_BUTTON),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} enter information details:")
    public void userEnterInformationDetails(Actor actor, List<String> InformationDetails) {
        actor.attemptsTo(
                saucedemoActions.enterFirstName(CSVDataReader.actor(InformationDetails.get(0))),
                saucedemoActions.enterLastName(CSVDataReader.actor(InformationDetails.get(1))),
                saucedemoActions.enterZipCode(CSVDataReader.actor(InformationDetails.get(2))),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the continue button")
    public void userClickOnTheContinueButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_CONTINUE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the finish button")
    public void userClickOnTheFinishButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_FINISH_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the back home button")
    public void userClickOnTheBackHomeButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_BACK_HOME_BUTTON)
        );
    }

    @And("{actor} click on the menu icon")
    public void userClickOnTheMenuIcon(Actor actor) {
        actor.attemptsTo(
               Click.on(saucedemoPath.CLICK_MENU_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the logout button")
    public void userClickOnTheLogoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(saucedemoPath.CLICK_LOGOUT_BUTTON),
                WaitSeconds.Now()
        );
    }
}
