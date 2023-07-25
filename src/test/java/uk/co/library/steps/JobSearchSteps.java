package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {

    @Given("I am on Home Page")
    public void iAmOnHomePage()  {

   }
    @When("i accept cookies")
    public void iAcceptCookies() throws InterruptedException {
        new HomePage().acceptIFrameAlert();
    }

    @And("enter job title {string}")
    public void enterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("enter Location {string}")
    public void enterLocation(String location) {
        new HomePage().enterTheLocation(location);
    }

    @And("select distance {string}")
    public void selectDistance(String distance) {
        new HomePage().selectTheDistance(distance);
    }

    @And("click on moreSearchOptionsLink")
    public void clickOnMoreSearchOptionsLink() {
        new HomePage().clickOnTheSearchOptionLink();
    }

    @And("enter salaryMin {string}")
    public void enterSalaryMin(String salaryMin) {
        new HomePage().enterTheMinimumSalary(salaryMin);
    }

    @And("enter salaryMax {string}")
    public void enterSalaryMax(String salaryMax) {
        new HomePage().enterTheMaximumSalary(salaryMax);
    }

    @And("select salaryType {string}")
    public void selectSalaryType(String salaryType) {
        new HomePage().salaryTypeSelect(salaryType);
    }

    @And("select jobType {string}")
    public void selectJobType(String jobType) {
        new HomePage().jobTypeSelect(jobType);
    }

    @And("click on Find Jobs button")
    public void clickOnFindJobsButton() {
        new HomePage().clickOnTheFindBtn();
    }

    @Then("verify the result")
    public void verifyTheResult() {
        Assert.assertEquals(new ResultPage().verifyTheResults(),"result");

    }


}
