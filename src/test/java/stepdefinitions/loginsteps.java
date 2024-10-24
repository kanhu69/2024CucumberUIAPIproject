package stepdefinitions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;






public class loginsteps 
{
	
	

		@Given("^I want to navigate to myntra$")
		public void i_want_to_navigate_to_myntra() throws Throwable {
		   WebDriver driver;
		   driver=new ChromeDriver();
		   driver.get("https://www.myntra.com/");
		}
		
		@Given("I want to make post call")
		public void i_want_to_make_post_call() 
		{
		    // Write code here that turns the phrase above into concrete actions
			 RestAssured.baseURI = "https://jsonplaceholder.typicode.com"; // Sample API

		        // Creating JSON body (can also be a Java object serialized to JSON)
		        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

		        // Sending POST request
		        Response response = given()
		            .header("Content-Type", "application/json")
		            .body(requestBody) // attaching the JSON body
		            .when()
		            .post("/posts") // endpoint
		            .then()
		            .extract()
		            .response();

		        // Print the response
		        System.out.println(response.asString());
		}
	
}



