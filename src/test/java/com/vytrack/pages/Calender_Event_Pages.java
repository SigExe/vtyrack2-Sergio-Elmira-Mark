package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Calender_Event_Pages extends BasePage {

    @FindBy(xpath = "//tr[2]/td[9]")
    private WebElement massActionButton;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']")
    private WebElement viewEditDeleteWindow;

    public boolean viewEditDeleteWindowVerification() {
        return viewEditDeleteWindow.isDisplayed();
    }

    public void hoverOverMassAction() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(massActionButton).perform();
    }
}