package starter.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Link;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class ItemPage extends PageComponent {
    public Target addToCart() {
        return (PageElement.located(By.xpath("//a[text()='Add to cart']")));
    }
    public Target goToCart() {
        return (Link.containing("Cart"));
    }
    public Target goToHome() {
        return (Link.containing("Home"));
    }
}