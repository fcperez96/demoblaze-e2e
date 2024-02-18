package demoblaze.pages;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class CartPage {
    public static final Target CART_PRODUCT_LIST= Target.the("cart product list")
            .located(xpath("//tbody[@id='tbodyid']/tr/td[2]"));

}
