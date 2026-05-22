package starter.demoblaze;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.AddItemActions;
import starter.actions.NavigateActions;
import org.openqa.selenium.WebDriver;
import starter.actions.PlaceOrderActions;
import starter.data.ClientData;

@ExtendWith(SerenityJUnit5Extension.class)
class buyTwoItems {

    @Managed
    WebDriver driver;

    NavigateActions navigate;
    AddItemActions addItem;
    PlaceOrderActions placeOrder;

    @BeforeEach
    void setUp() {
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Add two items to the cart and place an order")
    void addTwoItemsAndPlaceOrder() {

        ClientData clientData = ClientData.from(
            "Test name",
            "Test country",
            "Test city",
            "Test card",
            "Test month",
            "Test year"
        );
        
        navigate.navigateToProductStore();
        addItem.addItem();
        placeOrder.placeOrder(clientData);

    }

}
