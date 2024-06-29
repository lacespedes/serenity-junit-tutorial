package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;

public class InventoryPage extends PageObject {
    public String getHeading() {
//        assertThat(driver.findElement(By.cssSelector(".title")).getText())
//                .isEqualToIgnoringCase("PRODUCTS");
//        assertThat(find(".title").getText()).isEqualToIgnoringCase("PRODUCTS");
//        assertThat($(".title").getText()).isEqualToIgnoringCase("PRODUCTS");
        return $(".title").getText();
    }
}
