package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
		
		
		@FindBy(id="search")
		public  WebElement AllDepartmentSection; 
		
		@FindBy(xpath="//*[@id=\"search\"]/option[2]")
		public WebElement ElectronicsSection; 
		
		@FindBy(xpath="//*[@id=\"search\"]/option[3]")
		public WebElement ComputersSection  ; 
		
		
		@FindBy(xpath="//*[@id=\"search\"]/option[4]")
		public WebElement smarthHomeSection ; 
		
		@FindBy(xpath="//*[@id=\"search\"]/option[5]")
		public WebElement SportsSection  ; 
		
		@FindBy(xpath="//*[@id=\"search\"]/option[6]")
		public WebElement AuttomativeSection  ; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[1]/div/div/div[2]/p")
		public WebElement VideoGames; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[1]/div/div/div[1]/p")
		public WebElement TVandVideo; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[2]/div/div/div[1]/p")
		public WebElement Accessories; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[2]/div/div/div[2]/p")
		public WebElement networking; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[3]/div/div/div[1]/p")
		public WebElement smartHomeLighting; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[2]/div/div/div[2]/p")
		public WebElement netWorking; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[3]/div/div/div[2]/p")
		public WebElement plugsAndOutLets; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[4]/div/div/div[1]/p")
		public WebElement athleticClothing; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[4]/div/div/div[2]/p")
		public WebElement excersizeAndFitness; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[5]/div/div/div[1]/p")
		public WebElement automativeParts; 
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[5]/div/div/div[2]/p")
		public WebElement motorcyclePowersports; 
		
		
		
		@FindBy(xpath="//*[@id=\"home\"]/div[2]/div[1]/div[3]/div/div/div[2]/p")
		public WebElement plugsAndOutlets; 
		
		@FindBy(id="searchInput")
		public WebElement searchInput; 
		
		@FindBy(id="searchBtn")
		public WebElement searchIconBtn; 
		
		@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/p[1]")
		public WebElement PlugItem;  
		
		@FindBy(xpath="//select[@class='product__select']")
		public WebElement ItemQuantity; 
		
		
		@FindBy(id="addToCartBtn")
		public WebElement addToCardButtonIcon; 
		
		@FindBy(id="addPaymentBtn")
		public WebElement AddCreditDebitCardbtn; 
		
		@FindBy(id="paymentSubmitBtn")
		public WebElement AddyourCardButton; 
		
		@FindBy(id="placeOrderBtn")
		public WebElement placeYourOrderBtn; 
		
		
		@FindBy(xpath="//*[@id=\"cartBtn\"]/p")
		public WebElement cartIcon; 
		
		@FindBy(id="proceedBtn")
		public WebElement proceedButton ; 
		
		
		@FindBy(id="addAddressBtn")
		public WebElement AddNewAddressLink ; 
		

		@FindBy(xpath="//div[text()='Order Placed Successfully']")
		public WebElement orderPlacedSuccessfully; 
		
		
		
		@FindBy(id="addressBtn")
		public WebElement addyourAdressButton; 
		
		@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/p[1]")
		public WebElement itemApexLegend; 
		
		@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select/option[5]")
		public WebElement itemQuantityFive; 

		
		@FindBy(xpath="//*[@id=\"placeOrderBtn\"]")
		public WebElement placeYourOrderButton; 
		
		@FindBy(xpath="//div[text()='Order Placed Successfully']")
		public WebElement orderPlaceSuccessfully; 
		
	
		

	

	
}
