package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"orderLink\"]")
	public WebElement OrdersButton; 
	
	
	
	@FindBy(id="cancelBtn")
	public WebElement canceltheOrderbtn;
	
	@FindBy(xpath="//*[@id=\"reasonInput\"]")
	public WebElement selectCancelationReason;
	
	@FindBy(id="//*[@id=\"reasonInput\"]/option[2]")
	public WebElement wrongItem; 
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrderbtnlast; 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/p")
	public WebElement yourOrderbeenCanceled; 
	
	
	
	@FindBy(id="returnBtn")
	public WebElement returnItemButton; 
	
	@FindBy(xpath="//select[@id=\"reasonInput\"]/option[3]")
	public WebElement returnReasonDamage; 
	
	@FindBy(xpath="//select[@id=\"dropOffInput\"]/option[3]")
	public WebElement dropOffInputFedix ; 
	
	@FindBy(id="dropOffInput")
	public WebElement selectWhereTodropOff; 
	
	@FindBy(xpath="//*[@id=\"orderSubmitBtn\"]")
	public WebElement returnOrderButton; 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div/p")
	public WebElement returningMessage; 
	
	
	
	@FindBy(id="reviewBtn")
	public WebElement reviewButton; 
	
	@FindBy(id="headlineInput")
	public WebElement headlineInpute; 
	
	@FindBy(id="descriptionInput")
	public WebElement discriptionInpute; 
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement addYourViewBtn; 
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfully; 
	


}
