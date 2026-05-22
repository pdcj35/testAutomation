package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.data.ClientData;
import starter.pageobjects.ItemPage;
import starter.pageobjects.CartPage;
import static org.assertj.core.api.Assertions.assertThat;

public class PlaceOrderActions extends UIInteractionSteps {

    ItemPage itemPage;
    CartPage cartPage;

    @Step("User opens the home page")
    public void placeOrder(ClientData clientData) {
        $(itemPage.goToCart()).click();
        $(cartPage.PlaceOrder()).click();
        $(cartPage.NameInput()).typeAndTab(clientData.getName());
        $(cartPage.CountryInput()).typeAndTab(clientData.getCountry());
        $(cartPage.CityInput()).typeAndTab(clientData.getCity());
        $(cartPage.CardInput()).typeAndTab(clientData.getCard());
        $(cartPage.MonthInput()).typeAndTab(clientData.getMonth());
        $(cartPage.YearInput()).typeAndTab(clientData.getYear());
        $(cartPage.Purchase()).click();
        $(cartPage.OkButton()).click();
        assertThat(cartPage.ConfirmationMessage()).contains("Thank you for your purchase!");
    }
}