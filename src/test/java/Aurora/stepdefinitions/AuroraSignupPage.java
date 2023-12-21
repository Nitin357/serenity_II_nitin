package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.navigation.NavigateTo;
import starter.pages.signUpPageActions;

public class AuroraSignupPage {

    @Steps
    NavigateTo navigateTo;

    @Steps
    signUpPageActions signup;

    @Given("User is On Account Signup page")
    public void user_is_on_account_signup_page() {

        navigateTo.theHomePage();

    }
    @When("Enter Invalid Client code")
    public void enter_invalid_client()
    {
        signup.enterClientCode("678");
    }

    @When("fill all details")
    public void fill_all_details() {
        signup.enterCompanyName("RWS Moravia");
        signup.enterFirstName("Nitin");
        signup.enterLastName("Magar");
        signup.enterEmail("XYZ@rws.com");
        signup.enterTitle("QA_Testing");
        signup.enterAddress("Indore, Mp, India");
        signup.enterCountry("India");
        signup.enterMessage("Sign up By Automation testing script");
    }
    @When("clicks the Captcha checkbox")
    public void clicks_the_captcha_checkbox(){
        signup.clickCaptchaCheckbox();
    }
    @When("Click Submit button")
    public void click_submit_button() {
        signup.clickSubmitButton();
    }
    @Then("Form Submit Success Notification Displayed")
    public void verify_notification_message() {

        Assert.assertTrue(signup.signupFormSuccessNotification());
    }

    @Then("Mandatory field error Message Displayed")
    public void verify_manadatory_message()
    {
        Assert.assertTrue(signup.mandatoryFieldErrorMessage());
    }
    @Then("Invalid Client Message Display")
    public void invalid_client_message()
    {
        Assert.assertFalse(signup.invalidClientErrorMessage());
    }







}
