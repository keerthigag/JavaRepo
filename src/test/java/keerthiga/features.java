package keerthiga;

Scenario: Delete Customer scenario
Given browser window is open
   When user enters a customer ID in search box
   And hits submit
   Then user is allowed to select the confirm alert
   And customer is deleted successfully
   
   
package Deletecustomer;

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class LoginSteps {


		@Given("delete customer page is open")
		public void user_is_on_given page() {
			
			System.out.println("The user is in the delete customer page");
		}

		@When("user enters a customer ID in search box ")
		public void user_enters_the customer ID() {
			
			System.out.println("The user ID is been entered successfully");
		}
		@And("hits submit")
		public void clicks_on_submit_button() {
			
			System.out.println("Inside Step – clicks on submit button");
		}

		@Then("user is allowed to select the confirm alert ")
		public void user_clicks on select option () {
			
			System.out.println("Inside Step – the confirm option is selected by the customer");
		}

		@And("customer is deleted successfully ")
		public void user displays the customer is deleted successfully() {
			
			System.out.println("Inside Step – The customer deletion is successful");
		}

	}
