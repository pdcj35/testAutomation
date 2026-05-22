package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.StorePage;
import starter.pageobjects.ItemPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddItemActions extends UIInteractionSteps {

    StorePage storePage;
    ItemPage itemPage;
    NavigateActions navigate;

    @Step("User opens the home page")
    public void addItem() {
        $(storePage.itemOne()).click();
        $(itemPage.addToCart()).click();
        acceptAlertIfPresent();
        $(itemPage.goToHome()).click();
        $(storePage.itemOne()).click();
        $(itemPage.addToCart()).click();
        acceptAlertIfPresent();
    }

    private void acceptAlertIfPresent() {
        try {
            WebDriver driver = getDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            if (alert != null) {
                alert.accept();
            }
        } catch (Exception e) {
            // no alert present or could not be handled; ignore
        }
    }
}
