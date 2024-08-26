package serenityswag.inventory;



import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class ViewProductDetailsActions extends UIInteractionSteps {

    ProductListPageObject productList;

    @Step("View product deatils for product '{0}'")
    public void forProductWithName(String firstItemName) {
        $(ProductList.productDetailsLinkFor(firstItemName)).click();
    }
}
