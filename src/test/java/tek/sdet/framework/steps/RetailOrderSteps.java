package tek.sdet.framework.steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	  @And ("User click on Orders section")
	  public void userClickOnOrdersSection() {
		  click(factory.orderPage().OrdersButton);
		logger.info("user clicked on Orders button");
		  
	  }
	  
	    @And ("User click on Cancel The Order button")
	    public void userClickOnCanceTheOrderButton() {
	    	click(factory.orderPage().canceltheOrderbtn); 
	    	logger.info("user clicked on cancel order button");
	    	
	    }
	    @And ("User select the cancelation Reason {string}")
	    public void userSelectTheCancelationReasonBoughtWronItem(String returnReason) {
	    	
	    	selectByVisibleText(factory.orderPage().selectCancelationReason, returnReason);  
	    	logger.info("user select the cancelation reason bought wrong item");
	    }
	    @And ("User click on Cancel Order button")
	    public void userClickOnCanceOrderButton() {
	    	click(factory.orderPage().cancelOrderbtnlast); 
	    	logger.info("user click on cance order button");
	    	
	    }
	   @Then ("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	    public void acancelationMessageShouldBeDisplayedYourOrderHasBeenCancelded() {
	    	
		   String expectedResult = "Your Order Has Been Cancelled"; 
		   String actualResult = getText(factory.orderPage().yourOrderbeenCanceled); 
		   Assert.assertEquals(expectedResult, actualResult);
		   logger.info("a message displayed order has been canceled"); 
		   
		   
	
	   }
	   
	   
	   //test0002
	    @And ("User click on Return Items button")
	    public void userClickOnReturnItemsButton() {
	    	click(factory.orderPage().returnItemButton); 
	    	logger.info("user clicked on return Item button");
	    }
	    @And ("User select the Return Reason {string}")
	    public void userSelectTheReturnReasonItemDamaged(String returnReason) {
	    	selectByVisibleText(factory.orderPage().selectCancelationReason, returnReason);
	    	logger.info("user select the return reason to damaged");
	   
	    	
	    }
	    @And ("User select the drop off service {string}")
	    public void userSelectTheDropOffServiceFedix (String fedix) {
	    	selectByVisibleText(factory.orderPage().selectWhereTodropOff, fedix); 
	    	logger.info("user slect fedix");
	    }
	   @And ("User click on Return Order button")
	   public void userClickOnReturnOrderButton() {
		   click(factory.orderPage().returnOrderButton); 
	   }
	    @Then ("a cancelation message should be displayed ‘Return was successfull’")
	    public void aCancelationMessageShouldBeDisplayed() {
	    	
	    	   String expectedResult = "Return was successfull"; 
			   String actualResult = getText(factory.orderPage().yourOrderbeenCanceled); 
			   Assert.assertEquals(expectedResult, actualResult);
			   logger.info("a message displayed Return was successfull"); 
	    	
	    }
	    
	    
	    //test0003
	    
	  
	    @And("User click on Review button of the first item")
	    public void userClickOnReviewButton() {
	    	click(factory.orderPage().reviewButton); 
	    	logger.info("user clicked on review button of the first item in the list");
	      
	    }
	    @And("User write Review headline {string} and {string}")
	    public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline, String text) {
	      sendText(factory.orderPage().headlineInpute, headline); 
	      sendText(factory.orderPage().discriptionInpute, text); 
	      logger.info("user added hedaline and discription for the review of the item");
	    }
	    @And("User click Add your Review button")
	    public void userClickAddYourReviewButton() {
	    	click(factory.orderPage().addYourViewBtn); 
	    	logger.info("user click on add your view button");
	      
	    }
	    @Then("a review message should be displayed ‘Your review was added successfully’")
	    public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
	    	String expectedValue = "Your review was added successfully"; 
	    	slowDown(); 
	    	String actualValue = getText(factory.orderPage().yourReviewWasAddedSuccessfully); 
	    	Assert.assertEquals(expectedValue, actualValue);
	    	logger.info("a messaged displayed , your review was added successfully");
	        
	    }
	    
	    
	    

}
