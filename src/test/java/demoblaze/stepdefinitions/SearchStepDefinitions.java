package demoblaze.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import demoblaze.navigation.NavigateTo;
import demoblaze.search.LookForInformation;

public class SearchStepDefinitions {

    @When("{actor} add two products in the cart to buy")
    public void buyerAddTwoProductsInTheCartToBuy(Actor actor) {
        actor.attemptsTo(
                NavigateTo.demoblazeHomePage()
        );
    }

    @Then("{actor} should see the productos in the cart")
    public void heShouldSeeTheProductosInTheCart(Actor actor) {
    }

    @And("{actor} should be able to finalize the purchase")
    public void heShouldBeAbleToFinalizeThePurchase(Actor actor) {
    }

}
