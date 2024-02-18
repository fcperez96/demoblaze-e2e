package demoblaze.tasks;

import demoblaze.pages.PlaceOrderPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterTo {
    public static Performable shoppingCart(){
        return Task.where("{0} enter to shopping cart",
                Click.on(PlaceOrderPage.CART_BUTTON)
        );
    }
}
