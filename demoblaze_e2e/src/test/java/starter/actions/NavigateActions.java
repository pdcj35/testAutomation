package starter.actions;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    public void navigateToProductStore() {
        openUrl("https://www.demoblaze.com/");
    }
}