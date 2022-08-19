package keerthiga;

public class Snippet {
	Scenario: Delete Customer scenario
	 Given browser window is open
	    When user enters a customer ID in search box
	    And hits submit
	    Then user is allowed to select the confirm alert
	    And customer is deleted successfully
	
}

