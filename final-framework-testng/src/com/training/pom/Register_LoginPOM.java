package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_LoginPOM {
	
	private WebDriver driver; 
	
		
	@FindBy(xpath="/html/body/div[1]/header/div[2]/nav/div/ul/li[8]/a")
	private WebElement login_register; 

	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;

	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div/div/h2")
	private WebElement profile;
	
	public Register_LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public WebElement getProfile() {
		return this.profile;
	}
	
	public WebElement getUserName() {
		return this.userName;
	}
	
	public WebElement getLoginRegister() {
		return this.login_register;
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	public void clicklogin_register() {
		this.login_register.click(); 
	}
	public void clickLoginBtn() {
		this.login.click(); 
	}

		
	}


