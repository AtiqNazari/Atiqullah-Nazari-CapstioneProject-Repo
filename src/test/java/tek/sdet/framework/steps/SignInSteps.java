package tek.sdet.framework.steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	// @Test1
	@Given ("User is on retail website")
		public void userIsOnRetailWebsite() {

	}
	
	
	
	@When ("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().SignInBtn); 
		logger.info("user click on signINButton");
		
		
	}
	
	@And ("User enter email {string} and password {string}")
	public void UserEnterEmailAndPassword(String email, String password) {
		waitTillClickable(factory.signInPage().emailFeild); 
		sendText(factory.signInPage().emailFeild, email); 
		sendText(factory.signInPage().passwordFeild, password); 
		logger.info("User provided email and password");
		
	}
	@And ("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginBtn); 
		
	}
	@Then ("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		logger.info("user should be logged in into the account now");
		
	}
	
	
	
	
	// Scenario 2. 
	

	@And ("User click  on Create New Account button")
	public void userClickOnCreateNewAccountButton () {
		click(factory.signInPage().TheNewAccount); 
		logger.info("user clicked on create new Account btn");
		
	}
	@And ("User fill the Sign up information with bellow data")
	public void userFillTheSignUpInformation(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class,String.class); 
		sendText(factory.signInPage().NameInput, signUpData.get(0).get("name")); 
		sendText(factory.signInPage().EmailInput, signUpData.get(0).get("email")); 
		sendText(factory.signInPage().PasswordInput, signUpData.get(0).get("password")); 
		sendText(factory.signInPage().ConfirmPassInput, signUpData.get(0).get("confirmpassword")); 
	logger.info("user filled provided email password and confirmed the password");
	
		}
	@And ("User click on sign up button")
	public void userClickedOnSignUpBtn () {
		click(factory.signInPage().SignUpBtn); 
		logger.info("user clicked on sign up btn");
		
		
	}
	@Then ("The User should be logged in into Account")
	public void TheuserShouldBeLoggedInIntoAccount() {
		
		logger.info("user is in the account");
		
	}

}

	  
	  
	
	

