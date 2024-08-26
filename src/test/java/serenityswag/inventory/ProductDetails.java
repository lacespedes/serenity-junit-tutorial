package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementState;
import org.openqa.selenium.By;

public class ProductDetails extends PageObject {
    public String productName() {
        return $(".inventory_details_name").getText();
    }

    public WebElementState ProductImageWithAltValueOf(String firstItemName) {
        return find(By.cssSelector(".inventory_details_container img[alt='" + firstItemName + "']"));
    }
}
