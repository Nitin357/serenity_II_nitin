package starter.pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class signUpPageActions extends UIInteractionSteps {

    @Step("Search for term {0}")
    public void enterClientCode(String clientCode) {
        $(signUpPageElements.TXT_CLIENT_CODE).type(clientCode);
    }

    @Step("Search for term {0}")
    public void enterCompanyName(String companyName) {
        $(signUpPageElements.TXT_COMPANY_NAME).type(companyName);
    }

    @Step("Search for term {0}")
    public void enterFirstName(String firstName) {
        $(signUpPageElements.TXT_FIRST_NAME).type(firstName);
    }

    @Step("Search for term {0}")
    public void enterLastName(String lastName) {
        $(signUpPageElements.TXT_LAST_NAME).type(lastName);
    }

    @Step("Search for term {0}")
    public void enterEmail(String email) {
        $(signUpPageElements.TXT_EMAIL).type(email);
    }

    @Step("Search for term {0}")
    public void enterTitle(String title) {
        $(signUpPageElements.TXT_TITLE).type(title);
    }

    @Step("Search for term {0}")
    public void enterAddress(String address) {
        $(signUpPageElements.TXT_ADDRESS).type(address);
    }

    @Step("Search for term {0}")
    public void enterCountry(String country) {
        $(signUpPageElements.TXT_COUNTRY).type(country);
    }

    @Step("Search for term {0}")
    public void enterMessage(String message) {
        $(signUpPageElements.TXT_MESSAGE).type(message);
    }

    @Step("Search for term {0}")
    public void clickCaptchaCheckbox() {
        $(signUpPageElements.CHECKBOX_CAPTCHA).doubleClick();
    }

    @Step("Search for term {0}")
    public void clickSubmitButton() {
        $(signUpPageElements.BTN_SUBMIT).click();
    }

    @Step("Search for term {0}")
    public boolean signupFormSuccessNotification()
    {
        return $(signUpPageElements.NOTIFICATION_SUCCESS).isDisplayed();
    }

    @Step("Search for term {0}")
    public boolean mandatoryFieldErrorMessage(){return $(signUpPageElements.ERROR_MESSAGE).isDisplayed();}
    @Step("Search for term {0}")
    public boolean invalidClientErrorMessage(){return $(signUpPageElements.INVALID_CLIENT_MESSAGE).isDisplayed();}

}
