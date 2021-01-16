package org.cb.ta.TestSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.ta.BaseTest;
import org.cb.ta.CodingBookMainPage;
import org.testng.Assert;

public class CodingBookMainPageTest extends BaseTest {
    CodingBookMainPage codingBookMainPage;

        @Given("User opens CodingBook web page")
        public void user_opens_coding_book_web_page() {
            this.codingBookMainPage = new CodingBookMainPage(driver);
            Assert.assertEquals(driver.getTitle(), "CodingBook – Shape your future");
        }

        @When("User checks if CodingBook logo is visible on the top left corner")
        public void user_checks_if_coding_book_logo_is_visible_on_the_top_left_corner() {
            Assert.assertTrue(codingBookMainPage.getWebElementLogo().isDisplayed());
        }

        @When("User clicks CodingBook logo")
        public void user_clicks_coding_book_logo() {
            codingBookMainPage.getWebElementLogo().click();
        }

        @Then("Test if user lands CodingBook homepage")
        public void test_if_user_landed_coding_book_homepage() {
            Assert.assertEquals(driver.getTitle(),"CodingBook – Shape your future");
        }

    }

