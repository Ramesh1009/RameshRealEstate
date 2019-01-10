package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	
	private WebDriver driver; 
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/nav/div/ul/li[8]/a")
	private WebElement login_register; 
	
	@FindBy(linkText="Register")
	private WebElement registerTab; 
	
	@FindBy(name="submit")
	private WebElement register; 
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div/article/div/div/div/div[1]/p")
	private WebElement success;
	
	@FindBy(id="email")
	private WebElement email; 
	
	@FindBy(id="first-name")
	private WebElement firstName;
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public WebElement getRegisterTab() {
		return this.register;
	}
	
	public void sendfirstName(String firstName) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName); 
	}
	
	public void sendlastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName); 
	}
	
	public WebElement getSuccess() {
		return this.success;
	}
	
	public void clicklogin_register() {
		this.login_register.click(); 
	}
	
	public WebElement getLoginRegister() {
		return this.login_register;
	}
	
	public WebElement getEmail() {
		return this.email;
	}
	
	
	public void clickRegister() {
		this.register.click(); 
	}
	
	public void clickRegisterTab() {
		this.registerTab.click(); 
	}
	
	

}
