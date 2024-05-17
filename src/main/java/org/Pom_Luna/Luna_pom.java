package org.Pom_Luna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luna_pom {
	
	public static WebDriver driver;

	public Luna_pom(WebDriver driver1)

	{
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder=\"Enter your first name\"]")
	private WebElement firstname;
	@FindBy(xpath = "//input[@placeholder=\"Enter your last name\"]")
	private WebElement lastname;
	@FindBy(xpath = "//input[@placeholder=\"MM/DD/YYYY\"]")
	private WebElement DOB;
	@FindBy(xpath = "(//div[text()='8'])[1]")
	private WebElement click_DOB;
	@FindBy(id = "mobileNumber")
	private WebElement mobile;
	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement email;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Next_button;
	
	
	//home page 
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	private WebElement Address;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
	private WebElement treatment;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement treat_type;
	
	
	@FindBy(xpath = "(//span[@title='Select'][normalize-space()='Select'])[1]")
	private WebElement insurance;
	
	@FindBy(xpath = "(//div[contains(text(),'Medicare')])[1]")
	private WebElement insurance_type;
	
	@FindBy(css = "input[name='isPrimarySubscriber']")
	private WebElement policy_holder;
	
	
	@FindBy(xpath = "//span[text()='Select']")
	private WebElement gender;
	
	@FindBy(xpath = "//input[@placeholder='Enter policy number']")
	private WebElement policy_number;
	
	
	@FindBy(xpath = "//input[@placeholder='Enter group policy number']")
	private WebElement group_number;
	
	@FindBy(xpath = "(//span[text()='Select Image'])[1]")
	private WebElement inscartfr;
	
	@FindBy(xpath = "(//span[text()='Select Image'])[2]")
	private WebElement inscartbk;
	
	@FindBy(id = "termsAgreement")
	private WebElement agree;
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement final_Next;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getDOB() {
		return DOB;
	}
	public WebElement getClick_DOB() {
		return click_DOB;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getNext_button() {
		return Next_button;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getTreatment() {
		return treatment;
	}
	public WebElement getTreat_type() {
		return treat_type;
	}
	public WebElement getInsurance() {
		return insurance;
	}
	public WebElement getInsurance_type() {
		return insurance_type;
	}
	public WebElement getPolicy_holder() {
		return policy_holder;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getPolicy_number() {
		return policy_number;
	}
	public WebElement getGroup_number() {
		return group_number;
	}
	public WebElement getInscartfr() {
		return inscartfr;
	}
	public WebElement getInscartbk() {
		return inscartbk;
	}
	public WebElement getAgree() {
		return agree;
	}
	public WebElement getFinal_Next() {
		return final_Next;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
