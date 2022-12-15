package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility  {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option") 
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountOption); 
		logger.info("user click on account option in home pagee");
		
	}
	

	@And ("User update Name {string} and Phone {string}")
	
	public void userUpdateNameAndPhone(String NameValue, String PhoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInpute); 
		sendText(factory.accountPage().nameInpute, NameValue);  
		clearTextUsingSendKeys(factory.accountPage().phoneInpute); 
		sendText(factory.accountPage().phoneInpute, PhoneValue); 
		logger.info("user update name a phone number");
		
		
	}

	@And ("User click on Update button")
	public void userClickOnUpdateBtn() {
		click(factory.accountPage().updateBtn); 
		logger.info("user click on update button");
		
	}

	
	
	@Then("user profile information should be updated")
	public void userProfileInformationshouldbeUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().personalInformationUpdatedSuccesfully); 
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdatedSuccesfully)); 
		logger.info("information should be updated successfully");
	}
	
	
	//@Test22
	
	
	@And("User enter below information") 
	
		public void userEnterBellowInformation(DataTable data) {
		List<Map<String, String>> PasswordData = data.asMaps(String.class, String.class);  
		sendText(factory.accountPage().PreviousPasswordInput, PasswordData.get(0).get("previousPassword"));
		sendText(factory.accountPage().NewPasswordInput, PasswordData.get(0).get("newPassword")); 
		sendText(factory.accountPage().ConfrimPasswordInput, PasswordData.get(0).get("confirmPassword"));
		
		logger.info("user add the old password, the new password and confirmed the new password");
		
		
	}
	
	@And ("User click on Change Password button")
	public void userclickonChangePasswordButton() {
		click(factory.accountPage().ChangePasswordBtn); 
		logger.info("user clicked on Change Password button");
	}
	
	@Then ("a message should be displayed {string}")
	public void passwordUpdatedSuccessfully(String expectedMessage) {
		if(expectedMessage.contains("Password")) {
		waitTillPresence(factory.accountPage().PassUpdatedSuccessfully);
		Assert.assertEquals(expectedMessage, factory.accountPage().PassUpdatedSuccessfully.getText());
		logger.info(expectedMessage +  "is displayed");
		} else if (expectedMessage.contains("Payment")) {
			waitTillPresence(factory.accountPage().PaymentMethodAddedSuccessfully);
			Assert.assertEquals(expectedMessage, factory.accountPage().PaymentMethodAddedSuccessfully.getText());
			logger.info(expectedMessage +  "is displayed");
	}
	
		
	}
		
		
	
	
	
    // Scenario @Test33
	
	 @And ("User click on Add a payment method link")
	 public void userClickOnAddPayment( ) {
		 click(factory.accountPage().AddPaymentMethodLink); 
		 logger.info("user clicked on Add a payment method link/button");
		 
	 }
	 @And ("User is fill Debit or credit card information")
	    public void userFillDebitOrCreditInformation(DataTable data) {
		 List<Map<String, String>> paymentMethodData = data.asMaps(String.class, String.class); 
		 sendText(factory.accountPage().cardNumberInpute, paymentMethodData.get(0).get("cardNumber")); 
		 sendText(factory.accountPage().nameOnCardInput, paymentMethodData.get(0).get("nameOnCard")); 
		 selectByVisibleText(factory.accountPage().exprationYearInput, paymentMethodData.get(0).get("expirationYear"));
		 selectByVisibleText(factory.accountPage().expirationMonthInput, paymentMethodData.get(0).get("expirationMonth"));
		 sendText(factory.accountPage().securityCodeInput, paymentMethodData.get(0).get("securityCode"));
		 logger.info("user enter the payment required infromation");
	    	
	    }
	 @And ("User is click on Add your card button")
	 public void userClickOnaddYourcCardButton( ) {
		 click(factory.accountPage().AddyourCard); 
		 
	 }
	 
	 @Then("a message should be displayed ‘Payment Method added sucessfully’")
	 public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	     String expectedResult = "Payment Method added sucessfully" ; 
	     slowDown(); 
	     String actualResult = getText(factory.accountPage().PaymentMethodAddedSuccessfully); 
	      
	     Assert.assertEquals(expectedResult, actualResult);
	 }
	 
	 
	
	    
	    
	    //Test44
	 
	 
	    
	    @And ("User select the card with ending {string}")
	    public void userSelectTheCardWithEndingsixFive(String cardEndingNumber) {
	    	waitTillPresence(factory.accountPage().CardEndingWithfourFive); 
	    	click(factory.accountPage().CardEndingWithfourFive);  
	    	logger.info("user click on the card ending with fourFive");
	    }
	    
	    @And ("User click on Edit option of card section")
	    public void userClickOnEditOptionOfCardSection() {
	    	click(factory.accountPage().editCardButton); 
	    	logger.info("user clicked on edit button");
	    	
	    }
	
	    
	    @And ("user edit information with below data")
	    public void userEditInformationWithBellowData(DataTable data) {
	    List<Map<String, String>> paymentMethodData = data.asMaps(String.class, String.class); 
	    clearTextUsingSendKeys(factory.accountPage().cardNumberInpute); 
	    sendText(factory.accountPage().cardNumberInpute, paymentMethodData.get(0).get("cardNumber")); 
	    sendText(factory.accountPage().nameOnCardInput, paymentMethodData.get(0).get("nameOnCard")); 
	    selectByVisibleText(factory.accountPage().exprationYearInput, paymentMethodData.get(0).get("expirationYear"));
	    selectByVisibleText(factory.accountPage().expirationMonthInput, paymentMethodData.get(0).get("expirationMonth"));
	    clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
	    sendText(factory.accountPage().securityCodeInput, paymentMethodData.get(0).get("securityCode"));
	    logger.info("user enter the payment required infromation");
	    	
	    }
	   
	    @And ("user click on Update Your Card button") 
	    public void userClickOnUpdateYourCardBtn() {
	    	click(factory.accountPage().AddyourCard);
	    	logger.info("user clicked on Add your Card button");
	    	
	    }
	 
	     @Then("a Message should be displayed 'Payment Method updated Successfully'")
	     public void aMessageShouldBeDisplayedPaymentMethodUpdatedSucessfully() {
	    	    String expectedResult = "Payment Method updated Successfully" ; 
	    	    slowDown(); 
	    	    String actualResult = getText(factory.accountPage().paymentMethodUpdatedSuccessfully);   
	    	    Assert.assertEquals(expectedResult, actualResult);
	    }
	
	
	    // @Test55
	 @And ("User click on MasterCard")
	 public void userClickOnMasterCard() {
		 click(factory.accountPage().CardEndingWithfourFive);
		 logger.info("user clicked on master card button");
	 }
	    
	    @And ("User click on remove option of card section")
	    public void userClickOnRemoveOptionOfCardSection() {
	    	slowDown(); 
	    	click(factory.accountPage().removeCardButton); 
	    	logger.info("user clicked on Remove button");
	    	
	    }
	    @Then ("payment details should be removed")
	    public void paymentDetailsShouldBeRemoved() {
	    	logger.info("Payment Details are removed");
	    }
	    

	   
	    //@Test66
	     
	      @And ("User click on Add address option")
	      public void  userClickOnAddAddressOption() {
	    	  click(factory.accountPage().addAddress);
	      }
	      @And ("user fill address form with below information")
	      public void userFillNewAddressFormWithBellowInfo(DataTable data) {
	    	  List<Map<String, String>> addressData = data.asMaps(String.class, String.class); 
	    	  selectByVisibleText(factory.accountPage().countryInpute, addressData.get(0).get("country"));
	    	  sendText(factory.accountPage().fullNameInpute, addressData.get(0).get("fullName"));
	    	  sendText(factory.accountPage().phoneNumberInpute, addressData.get(0).get("phoneNumber"));
	    	  sendText(factory.accountPage().streetInpute, addressData.get(0).get("streetAddress"));
	    	  sendText(factory.accountPage().apartmenInput, addressData.get(0).get("apt"));
	    	  sendText(factory.accountPage().cityInput, addressData.get(0).get("city"));
	    	  selectByVisibleText(factory.accountPage().stateInpute, addressData.get(0).get("state"));
	          sendText(factory.accountPage().zipcodeInput, addressData.get(0).get("zipCode")); 

	      }
	      
	      @And ("User click Add Your Address button")
	      public void userClickAddYourAddressBtn() {
	    	  click(factory.accountPage().addYourAddressBtn);
	      }
	    	
	      
	     @Then ("a message should be displayed ‘Address Added Successfully‘")
	     public void messageShouldBeDisplayedAdressAddedSuccessfully () { 
	    	 String expectedResult = "Address Added Successfully" ; 
    	     slowDown(); 
    	     String actualResult = getText(factory.accountPage().addressAddedSuccessfully);   
    	     Assert.assertEquals(expectedResult, actualResult);
	     }
	    
	     
	     
	     //Test77
	      @And ("User click on edit address option")
	      public void userClickOnEditAddressOption() {
	    	  
	    	  click(factory.accountPage().EditAddressbtn);{
	    		  logger.info("user clicked on Address edit button");
	    	  }
	    	  
	      }
	      @And ("user fill new address form with below information")
	     public void userFillNewAddressWithBelowInformation(DataTable data) {
	    	  List<Map<String, String>> addressData = data.asMaps(String.class, String.class);
	    	  selectByVisibleText(factory.accountPage().countryInpute, addressData.get(0).get("country"));
	    	  clearTextUsingSendKeys(factory.accountPage().fullNameInpute); 
	    	  sendText(factory.accountPage().fullNameInpute, addressData.get(0).get("fullName"));
	    	  clearTextUsingSendKeys(factory.accountPage().phoneNumberInpute);
	    	  sendText(factory.accountPage().phoneNumberInpute, addressData.get(0).get("phoneNumber"));
	    	  clearTextUsingSendKeys(factory.accountPage().streetInpute);
	    	  sendText(factory.accountPage().streetInpute, addressData.get(0).get("streetAddress"));
	    	  clearTextUsingSendKeys(factory.accountPage().apartmenInput);
	    	  sendText(factory.accountPage().apartmenInput, addressData.get(0).get("apt"));
	    	  clearTextUsingSendKeys(factory.accountPage().cityInput);
	    	  sendText(factory.accountPage().cityInput, addressData.get(0).get("city"));
	    	  selectByVisibleText(factory.accountPage().stateInpute, addressData.get(0).get("state"));
	    	  clearTextUsingSendKeys(factory.accountPage().zipcodeInput);
	          sendText(factory.accountPage().zipcodeInput, addressData.get(0).get("zipCode")); 
	    	
	    	  
	      }
	      @And ("User click update Your Address button")
	      public void userClickUpdateYourADdressButton() {
	    	  click(factory.accountPage().addYourAddressBtn); 
	    	  
	      }
	     @Then ("a message should be displayed ‘Address Updated Successfully’")
	     public void aMessageshouldBeDisplayedAddressUpdatedSuccessfully() {
	    	 
	    	 String expectedResult = "Address Updated Successfully" ; 
    	     slowDown(); 
    	     String actualResult = getText(factory.accountPage().addressUpdatedSuccessfully);   
    	     Assert.assertEquals(expectedResult, actualResult);
	     }
	      

	      
	      //@Test88
	      
	       
	        @And ("User click on remove option of Address section")
	        public void userClickOnRemoveOptionOfAddressSection() {
	        	
	        	click(factory.accountPage().RemoveAdressButton) ;
	   
	        }
	       @Then ("Address details should be removed")
	       public void addressDetailsShouldBeRemoved() {
	    	   logger.info("the address details should be removed");
	       }
	     
	    
	      }

	    
	    
		
	
	

	
