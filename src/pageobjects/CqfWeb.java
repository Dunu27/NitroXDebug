package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CqfWeb"                                
     , summary=""
     , relativeUrl=""
     , connection="CqfWeb"
     )             
public class CqfWeb {

	@PageFrame()
	public static class Frame {
	    @TextType()
		@FindBy(xpath = "//form/input[1]")
		public WebElement frameWithShadowDomUsername;
		@ButtonType()
		@FindBy(xpath = "//form/div[1]/button[3]")
		public WebElement frameDisabledButton;
		@TextType()
		@FindBy(xpath = "//form/input[2]")
		public WebElement frameWithShadowDomPassword;
		@ButtonType()
		@FindBy(xpath = "//*[@id=\"submit\"]")
		public WebElement frameWithShadowDomSubmit;
		@ButtonType()
		@FindBy(xpath = "//*[@id=\"clear\"]")
		public WebElement frameWithShadowDomClear;
		@FindBy(xpath = "//iframe")
		public Frame1 frame;
	}

	@FindBy(xpath = "//section[2]//iframe")
	public Frame frame;

	@PageFrame()
	public static class Frame1 {
		@TextType()
		@FindBy(xpath = "//form/input[3]")
		public WebElement cannotTypeHere;
		@ButtonType()
		@FindBy(xpath = "//form/div[1]/button[3]")
		public WebElement disabledButton;
		@TextType()
		@FindBy(xpath = "//form/input[1]")
		public WebElement nestedFrameWithShadowDomSubject;
		@TextType()
		@FindBy(xpath = "//form/input[2]")
		public WebElement nestedFrameWithShadowDomMessage;
		@ButtonType()
		@FindBy(xpath = "//*[@id=\"submitNested\"]")
		public WebElement nestedFrameWithShadowDomSubmit;
		@ButtonType()
		@FindBy(xpath = "//*[@id=\"clearNested\"]")
		public WebElement nestedFrameWithShadowDomClear;
	}
	@ButtonType()
	@FindBy(xpath = "//tr[1]//button[normalize-space(.)='View']")
	public WebElement SimpleHTMLTableViewButton;
	
	@TextType()
	@FindBy(xpath = "//input[@id='username']")
	public WebElement username;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='cardType']")
	public WebElement cardType;
	@TextType()
	@FindBy(xpath = "//input[@id='cardNumber']")
	public WebElement cardNumber;
	@TextType()
	@FindBy(xpath = "//input[@id='expiry']")
	public WebElement expiryDate;
	@TextType()
	@FindBy(xpath = "//input[@id='cvv']")
	public WebElement cVV;
	@BooleanType()
	@FindBy(xpath = "//input[@name='notify_sms']")
	public WebElement Email_Alerts;
	@TextType()
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@id='street']")
	public WebElement street;
	@BooleanType()
	@FindBy(xpath = "//input[@name='notify_email']")
	public WebElement Preferences;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Dark']/input[@name='theme']")
	public WebElement Theme_Settings;
		
}
