package starter.pages;

import org.openqa.selenium.By;

class signUpPageElements {
    static By TXT_CLIENT_CODE= By.id("client_code");
    static By TXT_COMPANY_NAME= By.id("company_name");
    static By TXT_FIRST_NAME = By.id("first_name");
    static By TXT_LAST_NAME = By.id("last_name");
    static By TXT_EMAIL = By.id("email");
    static By TXT_TITLE= By.id("title");
    static By TXT_ADDRESS = By.id("address");
    static By TXT_COUNTRY = By.id("country");
    static By TXT_MESSAGE = By.id("message");
    static By CHECKBOX_CAPTCHA = By.className("recaptcha-checkbox-checkmark");
    static By BTN_SUBMIT = By.id("submit");
    static By NOTIFICATION_SUCCESS= By.id("success-submit");

    static By ERROR_MESSAGE= By.id("company-name-required");

    static By INVALID_CLIENT_MESSAGE = By.id("client-code-required");

}
