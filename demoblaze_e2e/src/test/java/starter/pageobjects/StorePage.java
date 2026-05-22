package starter.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class StorePage extends PageComponent {
    public Target itemOne() {
        return (PageElement.located(By.cssSelector("h4.card-title:nth-of-type(1)")));
    }
}