package org.example;

import CrawfordFacebook.Crawford_Facebook_Url;
import CrawfordFacebook.Facebook_Assert;
import crawfordUrl.Browser_Url_Assert;
import crawfordUrl.OpenBrowser_Url;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    Crawford_Facebook_Url crawford_facebook_url = new Crawford_Facebook_Url();
    Facebook_Assert facebook_assert = new Facebook_Assert();
    OpenBrowser_Url openBrowser_url = new OpenBrowser_Url();
    Browser_Url_Assert browser_url_assert = new Browser_Url_Assert();


    //************************************ FACEBOOK PAGE ******************************************

    @Given("^User on facebook homepage$")
    public void userOnFacebookHomepage() {
        crawford_facebook_url.open_Browser();
    }


    @When("^User able to see open facebook page$")
    public void user_able_to_see_open_facebook_page() {
        facebook_assert.user_On_facebook();
    }

    @Then("^User successfully landing on facebook url page$")
    public void user_successfully_landing_on_facebook_url_page() {
        facebook_assert.facebook_Assert();
        crawford_facebook_url.close_Browser();


    }
//***************************  HOMEPAGE *************************

    @Given("^User on homepage$")
    public void userOnHomepage() {
        openBrowser_url.open_Browser();

    }

    @When("^User able to see browser open$")
    public void user_able_to_see_browser_open() {

        browser_url_assert.browser_OPen();

    }

    @Then("^User should be successfully open browser$")
    public void user_should_be_successfully_open_browser() {
        browser_url_assert.browser_Url_Assert();
        openBrowser_url.close_Browser();


    }


}
