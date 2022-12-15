package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this); 
		}
	
	@FindBy(xpath="//*[@id=\"accountLink\"]")
	public WebElement accountOption; 
	
	@FindBy(id="nameInput")
	public WebElement nameInpute; 
	
	@FindBy(id="personalPhoneInput")
	public WebElement phoneInpute; 

	@FindBy(id="personalUpdateBtn")
	public WebElement updateBtn; 
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationUpdatedSuccesfully; 
	
	
	//test22
	
	@FindBy(id="previousPasswordInput") 
	public WebElement PreviousPasswordInput; 
	
	@FindBy(id="newPasswordInput") 
	public WebElement NewPasswordInput; 
	
	@FindBy(id="confirmPasswordInput") 
	public WebElement ConfrimPasswordInput; 
	
	@FindBy(id="credentialsSubmitBtn") 
	public WebElement ChangePasswordBtn; 
	
	@FindBy(xpath="//div[text()=\"Password Updated Successfully\"]")
    public WebElement PassUpdatedSuccessfully;
	
	
	
	//test33
	@FindBy(xpath="//p[text()='Add a payment method']")
	
	public WebElement AddPaymentMethodLink; 
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInpute; 
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput; 
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput; 
	
	@FindBy(id="expirationYearInput")
	public WebElement exprationYearInput; 
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput; 
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddyourCard; 
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentMethodAddedSuccessfully; 
	
	//Test44
	
	@FindBy(xpath="//div[@class='account__payment-sub']")
	public WebElement CardEndingWithfourFive; 
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[1]")
	public WebElement editCardButton; 
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfully; 
	
	
	//Test55
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/p[2]")
	public WebElement MasterCardButton; 
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
	public WebElement removeCardButton; 
	
	
	//test66
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement addAddress ;
	
	@FindBy(id="countryDropdown")
	public WebElement countryInpute;
	
	@FindBy(id="fullNameInput")
	public WebElement fullNameInpute;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumberInpute;
	
	@FindBy(id="streetInput")
	public WebElement streetInpute; 
	
	@FindBy(id="apartmentInput")
	public WebElement apartmenInput; 
	
	@FindBy(id="cityInput")
	public WebElement cityInput; 
	
	@FindBy(xpath="//*[@id=\"newForm\"]/div[5]/div[2]/div/div/select")
	public WebElement stateInpute; 
	
	@FindBy(id="zipCodeInput")
	public  WebElement zipcodeInput; 
	
	@FindBy(id="addressBtn")
	public WebElement addYourAddressBtn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfully; 
	
	 //Test77
    
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[1]")
    public WebElement EditAddressbtn; 
    
    @FindBy(xpath="//div[text()='Address Updated Successfully']")
    public WebElement addressUpdatedSuccessfully; 
    
    
    
    //Test88
    @FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[2]/button[2]")
    public WebElement RemoveAdressButton; 
    
 
	

}
