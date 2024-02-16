package demoblaze.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class PlaceOrderPage {

    public static final Target HOME_BUTTON = Target.the("home button").located(id("nava"));
    public static final Target LIST_OF_HOME_PRODUCTS = Target.the("list of home products").locatedBy("div#tbodyid > div:nth-child({0})");
    public static final Target CART_BUTTON = Target.the("cart button").located(By.id("cartur"));

}
