package tek.sdet.framework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this); 
		}
	
	@FindBy(id="signinLink")
    public WebElement SignInBtn; 
	
	@FindBy(id="email")
	public WebElement emailFeild; 
	
	@FindBy(id="password")
	public WebElement passwordFeild; 
	
	@FindBy(id="loginBtn")
	public WebElement loginBtn; 
	

	
	
	@FindBy(id="newAccountBtn")
	public WebElement TheNewAccount; 
	
	@FindBy(id="nameInput")
	public WebElement NameInput; 
	
	@FindBy(id="emailInput")
	public WebElement EmailInput; 
	
	@FindBy(id="passwordInput")
	public WebElement PasswordInput; 
	
	@FindBy(id="confirmPasswordInput")
	public WebElement ConfirmPassInput; 
	
	@FindBy(id="signupBtn")
	public WebElement SignUpBtn; 
	
	
	
	
	
	
	
	
}




