package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	
	//Test001 
	@When ("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllDepartmentSection); 
		
		logger.info("user click on all departments section");
		
	}

	@Then ("below options are present in Shop by Department sidebar")
	
	public void belowOptionsArePresentInShopByDepartmentSidebar (DataTable dataTable) {
		List<List<String>> department = dataTable.asLists();
		Assert.assertTrue(isElementDisplayed((factory.homePage().ElectronicsSection))); 
		Assert.assertTrue(isElementDisplayed((factory.homePage().ComputersSection))); 
		Assert.assertTrue(isElementDisplayed((factory.homePage().smarthHomeSection))); 
		Assert.assertTrue(isElementDisplayed((factory.homePage().SportsSection))); 
		Assert.assertTrue(isElementDisplayed((factory.homePage().AuttomativeSection))); 
		logger.info("user click on all department and all the sections are displayed");
		
		
	}
	
	
	//test002
	
	String department; 

 
	@When ("User on {string}")
	public String userOnElectronics(String department) {
		 
		switch(department) {
		case "Electronics": 
		Assert.assertTrue(isElementDisplayed(factory.homePage().ElectronicsSection));
		logger.info("user is on electronics");
		break; 
		
		case "Computers": 
			Assert.assertTrue(isElementDisplayed(factory.homePage().ComputersSection));
			logger.info("user is on computers");
			break; 
			
		case "Sports": 
			Assert.assertTrue(isElementDisplayed(factory.homePage().SportsSection));
			logger.info("user is on sports");
			break; 
			
		case "Automotive": 
			Assert.assertTrue(isElementDisplayed(factory.homePage().AuttomativeSection));
			logger.info("user is on automotive ");
			break; 
			
		default: 
		
		}
		return this.department = department; 
	}
	
	
	@Then ("below options are present in department")
	public void belowOptionsArePresentinDepartment(DataTable dataTable) {
		
		List<List<String>> department = dataTable.asLists();
		
		switch (this.department) {
		case "Electronics": 
			 click(factory.homePage().ElectronicsSection);
	            String video = getText(factory.homePage().VideoGames);
	            String TVAndVideo = getText(factory.homePage().TVandVideo);
	            Assert.assertEquals(TVAndVideo, department.get(0).get(0));
	            Assert.assertEquals(video, department.get(0).get(1));
	            logger.info(video + " options are present in department" + TVAndVideo);
	            break;
	        case "Computers":
	            click(factory.homePage().ComputersSection);
	            String Accessories = getText(factory.homePage().Accessories);
	            String Networking = getText(factory.homePage().networking);
	            Assert.assertEquals(Accessories, department.get(0).get(0));
	            Assert.assertEquals(Networking, department.get(0).get(1));
	            logger.info(Accessories + " options are present in department" + Networking);
	            break;
	        case "Sports":
	            click(factory.homePage().SportsSection);
	            String AthleticClothing = getText(factory.homePage().athleticClothing);
	            String ExerciseFitness = getText(factory.homePage().excersizeAndFitness);
	            Assert.assertEquals(AthleticClothing, department.get(0).get(0));
	            Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
	            logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
	            break;
	        case "Automotive":
	            click(factory.homePage().AuttomativeSection);
	            String AutomativePartsAccessories = getText(factory.homePage().automativeParts);
	            String MotorCyclePowersports = getText(factory.homePage().motorcyclePowersports);
	            Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
	            Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
	            logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
	            break;
			
		}
	}
	
	
	
	
	
	
	
	
	    //Test003
	   @And ("User change the category to {string}")
	   public void userChangeTheCatagoryToSmartHOme (String smartHome) {
		   selectByVisibleText(factory.homePage().AllDepartmentSection, smartHome); 
		 
		   
	   }
	   
	 
	   
	   @And ("User search for a item {string}")
	   public void userSearchforAnItemKasaOutdoorSmartPlug(String KasaSmartPlug) {
		   sendText(factory.homePage().searchInput, KasaSmartPlug); 
		   logger.info("user search for the item in search box");
		   
	   }
		
	   
	   @And ("User click on Search icon")
	   public void userClickOnSearchIconBtn() {
	
		   
		  click(waitTillClickable((factory.homePage().searchIconBtn))); 
		   logger.info("user clicked on search icon to look for the item");
		   click(factory.homePage().searchIconBtn); 
		   
		   
	   }
	   
	   @And ("User click on item")
	   public void userClickOnPlugItem() {
		   click(factory.homePage().PlugItem); 
		   logger.info("user click on the plug item");
		   
	   }
	   
	  @And ("User select quantity {string}")
	  public void userSelectQuantityToTwo(String quantityTwo) {
		  
		  selectByVisibleText(factory.homePage().ItemQuantity, quantityTwo); 
		 logger.info("user select the quantity to two");
		  
		  
	  }
	  @And ("User click add to Cart button")
	  public void userClickAddToCartButtonIcon() {
		  click(factory.homePage().addToCardButtonIcon); 
	  }
	  @Then ("the cart icon quantity should change to {string}")
	  public void theCartIconQuantityShouldChangeToTwo(String displayTwo) {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().ItemQuantity)); 
		 logger.info("the cart icon should be displayed with 2");
	  }
	  
	  
	  
	  
	  
	  //Test004
	  @And ("User click on Cart option")
	  public void userClickOnCartOption() {
		  click(factory.homePage().cartIcon); 
		  logger.info("usr click on cart option button");
		  
	  }
	  
	 
	    @And ("User click on Proceed to Checkout button")
	    public void userClickOnProccedToCheckoutButton() {
	    	click(factory.homePage().proceedButton); 
	    	logger.info("user click on proceed to check out button");
	    	
	    }
	   @And ("User click Add a new address link for shipping address")
	   public void userClickAddaNewAddressLinkForShippingAdress() {
		   click(factory.homePage().AddNewAddressLink); 
		   logger.info("user click on new address link button");
		   
	   }
	    @And ("User fill new address form with below information")
	    public void UserFillNewAddressFormWithBelowInformation(DataTable Data) {
	    	List<Map<String,String>> addressData = Data.asMaps(String.class, String.class); 
	    	  selectByVisibleText(factory.accountPage().countryInpute, addressData.get(0).get("country"));
	    	  sendText(factory.accountPage().fullNameInpute, addressData.get(0).get("fullName"));
	    	  sendText(factory.accountPage().phoneNumberInpute, addressData.get(0).get("phoneNumber"));
	    	  sendText(factory.accountPage().streetInpute, addressData.get(0).get("streetAddress"));
	    	  sendText(factory.accountPage().apartmenInput, addressData.get(0).get("apt"));
	    	  sendText(factory.accountPage().cityInput, addressData.get(0).get("city"));
	    	  selectByVisibleText(factory.accountPage().stateInpute, addressData.get(0).get("state"));
	          sendText(factory.accountPage().zipcodeInput, addressData.get(0).get("zipCode")); 
	    	
	    	logger.info("user add the new address");
	    }
	    
	    @And ("User click Add Your Address buttn")
	    public void userClickADdyourAdressbutton() {
	    	 
	    	waitTillClickable(factory.homePage().addyourAdressButton); 
	    	click(factory.homePage().addyourAdressButton); 
	    	logger.info("user clicked on add your address button");
	    }
	      
	    @And ("User click Add a credit card or Debit Card for Payment method")
	    	public void userClickAddaCreditCardOrDebitCardforPaymentMethod() {
	    	click(factory.homePage().AddCreditDebitCardbtn); 
	    	logger.info("user clicked on add credit or debit card button");
	    }
	    
	    @And ("User fill Debit or credit card information")
	    public void userFillDebitOrCreditCardInformation(DataTable data) {
	    	
	    	 List<Map<String, String>> paymentMethodData = data.asMaps(String.class, String.class); 
			 sendText(factory.accountPage().cardNumberInpute, paymentMethodData.get(0).get("cardNumber")); 
			 sendText(factory.accountPage().nameOnCardInput, paymentMethodData.get(0).get("nameOnCard")); 
			 selectByVisibleText(factory.accountPage().exprationYearInput, paymentMethodData.get(0).get("expirationYear"));
			 selectByVisibleText(factory.accountPage().expirationMonthInput, paymentMethodData.get(0).get("expirationMonth"));
			 sendText(factory.accountPage().securityCodeInput, paymentMethodData.get(0).get("securityCode"));
			 logger.info("user enter the payment required infromation");
	    	
	    }
	    
	    @And ("User click on Add your card button")
	    public void userClickOnaddYourCardButton() {
	    	click(factory.homePage().AddyourCardButton); 
	    	logger.info("user clicked on add your card button"); 
	    	
	    }
	    @And ("User click on Place Your Order")
	   public void userClickONPlaceYourOrder() {
	    	click(factory.homePage().placeYourOrderBtn);
	    	logger.info("user clicked on place your order button");
	    	
	    }
	    @Then (" a message should be displayed ‘Order Placed Successfully’")
	   public void aMessageShouldBeDisplayedOrderPlacedSuccessfully() {
	    	
	    	String expectedResult = "Order Placed Successfully"; 
	    	String actualResult = getText(factory.homePage().orderPlacedSuccessfully); 
	    	Assert.assertEquals(expectedResult, actualResult);
	    	
	    	logger.info("a messaged should be displayed order placed successfully");
	
	    }
	    
	    
	    
	   // @Test005
	    @And ("User changed the category to {string}")
	    public void userChangeTheCategoryToElectronics(String electronics) {
	    	
	    	selectByVisibleText(factory.homePage().AllDepartmentSection, electronics);
	    	logger.info("user changed the catagory to Electronics");
	    	
	    }
	    @And ("User search for an item {string}")
	    public void userSearchForAnItemApexLegends(String apexLegends) {
	    	sendText(factory.homePage().searchInput, apexLegends ); 
	    	logger.info("user search for an item Apex Legends");
	    	
	    }
	    @And ("User clicked on Search icon")
	    public void userClickOnSearchIcon() {
	    	 
	    	click(factory.homePage().searchIconBtn); 
	    }
	    
	    
	    @And ("User click on an item")
	    public void userClickonItemApexLegends() {
	    	 
	    	click(factory.homePage().itemApexLegend); 
	    	logger.info("user clicked on on item apex legend");
	    	
	    }
	    @And ("User selected quantity {string}")
	    public void userSelectQuantityFive(String itemQuantityFive) {
	    	selectByVisibleText(factory.homePage().ItemQuantity, itemQuantityFive); 
	    	logger.info("user select the quantity to five");
	    	
	    }
	
	    @Then ("the carts icon quantity should change to {string}")
	    public void theCartIconQuantityShouldChangeTofive(String DisplayitemFive) {
	   	 Assert.assertTrue(isElementDisplayed(factory.homePage().ItemQuantity)); 
		 logger.info("the cart icon should be displayed with 5");
	    	 
	    	
	    }
	    @And ("User clicked add to Cart button")
		  public void userClickedAddToCartButtonIcon() {
			  click(factory.homePage().addToCardButtonIcon); 
		  }
	    
	    
	    
	    @And ("User clicked on Cart option")
	    public void userClickedOnCartOption() {
	    	click(factory.homePage().cartIcon); 
	    	 
	    }
	    @And("User clicked on Proceed to Checkout button")
	    public void userClickOnProceedToCheckOutButton() {
	    	slowDown(); 
	    click(factory.homePage().proceedButton); 
	    }
	   
	    @And ("User clicked on Place Your Order")
	    
	    public void userClickOnPlaceYourOrder () {
	    	click(factory.homePage().placeYourOrderButton); 
	    	logger.info("user click on place your order button");
	    	
	    }
	    
	    @Then ("a message should be displayed ‘Order Placed Successfully’")
	    public void aMessageShouldBeDisplayedOrderPlaceThanks() {
	    	String expectedResult = "Order Placed Successfully"; 
	    	slowDown(); 
	    	String ActualResult = getText(factory.homePage().orderPlaceSuccessfully);
	    	Assert.assertEquals(expectedResult, ActualResult); 
	    	logger.info("a Messaged displayed, Order Placed successfully"); 
	    	
	    }

}

	





