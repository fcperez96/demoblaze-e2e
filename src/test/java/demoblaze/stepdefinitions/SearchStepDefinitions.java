package demoblaze.stepdefinitions;

import demoblaze.pages.CartPage;
import demoblaze.tasks.Add;
import demoblaze.tasks.EnterTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import demoblaze.navigation.NavigateTo;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static demoblaze.pages.CartPage.*;

public class SearchStepDefinitions {

    @When("{actor} add two products in the cart to buy")
    public void buyerAddTwoProductsInTheCartToBuy(Actor actor) {
        NavigateTo.demoblazeHomePage().performAs(actor);
        Add.twoRandomProducts().performAs(actor);
    }

    @Then("{actor} should see the productos in the cart")
    public void heShouldSeeTheProductosInTheCart(Actor actor) {
        String firstProductName = actor.recall("productOneName");
        String secondProductName = actor.recall("productTwoName");
        EnterTo.shoppingCart().performAs(actor);
        List<WebElementFacade> cartProductList = CART_PRODUCT_LIST.resolveAllFor(actor);
        cartProductList.forEach(cartProduct ->{
            if(cartProductList.indexOf(cartProduct) == 0){
                Ensure.that(cartProduct.getText()).isEqualToIgnoringCase(firstProductName).performAs(actor);
            } else {
                Ensure.that(cartProduct.getText()).isEqualToIgnoringCase(secondProductName).performAs(actor);
            }
        });
    }

    @And("{actor} should be able to finalize the purchase")
    public void heShouldBeAbleToFinalizeThePurchase(Actor actor) {
    }

}
