package example.cucumber;
import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author nablik
 *
 */
public class ExampleMapping {

    private Response response;

    int resultSumma, resultMul = 0;
    @Given("^the user send a get request to (.+)")
    public void setBaseUrl(String baseUrl) throws URISyntaxException{
        this.response = RestAssured.when().get(baseUrl);
    }

    @Then("^verify that the response code is equal to (.+)")
    public void verifyStatusCode(int statusCode){
        assertEquals(response.getStatusCode(), statusCode);
    }

    @When("^verify (.*) plus (.*)")
    public void verify_plus(int first,  int second){
        resultSumma= first + second;
    }

    @Then("^equals (.*)$")
    public void verify_plus(int res){
        assertEquals(resultSumma, res);
    }


    @When("^verify (.*) multiply (.*)")
    public void verify_multiply(int first,  int second){
        resultMul= first * second;
    }

    @Then("^get result of multi (.*)$")
    public void get_result_of_multi(int res){
        assertEquals(resultMul, res);
    }

}