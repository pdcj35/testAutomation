package starter.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.PageElement;

public class CartPage extends PageComponent {
    public Target PlaceOrder() {
        return (Button.withText("Place Order"));
    }
    public Target NameInput() {
        return (InputField.withNameOrId("name"));
    }
    public Target CountryInput() {
        return (InputField.withNameOrId("country"));
    }
    public Target CityInput() {
        return (InputField.withNameOrId("city"));
    }
    public Target CardInput() {
        return (InputField.withNameOrId("card"));
    }
    public Target MonthInput() {
        return (InputField.withNameOrId("month"));
    }
    public Target YearInput() {
        return (InputField.withNameOrId("year"));
    }
    public Target Purchase() {
        return (Button.withText("Purchase"));
    }
    public Target OkButton() {
        return (Button.withText("OK"));
    }
    public String ConfirmationMessage() {
        return $(PageElement.locatedBy("//h2[contains(text(),'Thank you for your purchase!')]")).getText();
    }
}