package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CqfWebPage"                                
     , summary=""
     , relativeUrl=""
     , connection="CqfWeb"
     )             
public class CqfWebPage {
    @TextType()
	@FindBy(xpath = "//td[1]/input")
	public WebElement UserDataTableName;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[2]/input")
	public WebElement UserDataTableEmail;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[3]/input")
	public WebElement UserDataTableCity;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	public WebElement UserDataTableSave;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Saved']")
	public WebElement UserDataTableSaved;
	@ButtonType()
	@FindBy(xpath = "//td/button[normalize-space(.)='Disabled']")
	public WebElement UserDatatableDisabled;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add New Row']")
	public WebElement UserDataTableAddNewRow;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[1]/input")
	public WebElement UserDataTableName1;
	@ButtonType()
	@FindBy(xpath = "//tr[2]//button[normalize-space(.)='Delete']")
	public WebElement delete;
	@TextType()
	@FindBy(xpath = "//td[2]/input")
	public WebElement userDataEmail;
	@TextType()
	@FindBy(xpath = "//td[3]/input")
	public WebElement city;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[2]/input")
	public WebElement userDataEmail1;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[3]/input")
	public WebElement city1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']")
	public WebElement moreShowMoreNavigationItems;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Weather Information']")
	public WebElement weatherInformation;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Data Binding & Rendering']")
	public WebElement dataBindingAndRendering;
    @TextType()
	@FindBy(xpath = "//section[6]/form[1]/input[1]")
	public WebElement multipleFormsSectionNameField;
	@TextType()
	@FindBy(xpath = "//section[6]/form[1]/input[2]")
	public WebElement multipleFormsSectionEmailField;
	@ButtonType()
	@FindBy(xpath = "//section[6]/form[1]/button[normalize-space(.)='Clear']")
	public WebElement multipleFormsSectionClearButton;
	@ButtonType()
	@FindBy(xpath = "//form[1]/button[normalize-space(.)='Submit']")
	public WebElement multipleFormsSectionSubmitButton;
	@ChoiceListType()
	@FindBy(xpath = "//select")
	public WebElement multipleFormsSectionDropdown;
	@TextType()
	@FindBy(xpath = "//form[3]/textarea")
	public WebElement multipleFormsSectionMessageField;
	@ButtonType()
	@FindBy(xpath = "//form/button[normalize-space(.)='Disabled']")
	public WebElement disabled;
	
	
	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//input[@id='name']")
		public WebElement FormName;
		@TextType()
		@FindBy(xpath = "//input[@id='email']")
		public WebElement FormEmail;
		@ButtonType()
		@FindBy(xpath = "//button[@id='submitBtn']")
		public WebElement FormSubmitBtn;
		@ButtonType()
		@FindBy(xpath = "//button[@id='clearBtn']")
		public WebElement FormClearBtn;
		@FindBy(xpath = "//iframe")
		public Frame1 frame;
	}

	@FindBy(xpath = "//section[1]//iframe")
	public Frame frame;

	@PageFrame()
	public static class Frame1 {
	    
		@TextType()
		@FindBy(xpath = "//input[@id='phone']")
		public WebElement NestedFramePhone;
		@TextType()
		@FindBy(xpath = "//input[@id='city']")
		public WebElement NestedFrameCity;
		@ButtonType()
		@FindBy(xpath = "//button[@id='submitBtn2']")
		public WebElement NestedFrameSubmitBtn;
		@TextType()
		@FindBy(xpath = "//section")
		public WebElement NestedFrameSubmitBtn1;
		@ButtonType()
		@FindBy(xpath = "//button[@id='clearBtn2']")
		public WebElement NestedFrameClearBtn;
	}
	@ButtonType()
	@FindBy(xpath = "//tr[1]//button[normalize-space(.)='View']")
	public WebElement popupClickButton;
	@TextType()
	@FindBy(xpath = "//span[@id='popupProduct']")
	public WebElement PopupProductfield;
	@TextType()
	@FindBy(xpath = "//span[@id='popupPrice']")
	public WebElement PopupPriceField;
	@TextType()
	@FindBy(xpath = "//span[@id='popupStock']")
	public WebElement PopupStockField;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement PopupCloseButton;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add Element']")
	public WebElement addElement;
	@TextType()
	@FindBy(xpath = "//div[@id='dynamicContainer']/div/input")
	public WebElement DynamicElementTextField;
	@ButtonType()
	@FindBy(xpath = "//div/button[normalize-space(.)='Save']")
	public WebElement DynamicSavebutton;
	@ButtonType()
	@FindBy(xpath = "//div/button[normalize-space(.)='Disabled']")
	public WebElement DynamicElementDisabledButton;
	@TextType()
	@FindBy(xpath = "//input[@id='email']")
	public WebElement Deepdomlevel2emailfield;
	@TextType()
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement deepdomlevel2phonenofield;
	@TextType()
	@FindBy(xpath = "//input[@id='street']")
	public WebElement DeepdomleveleStreetField;
	@TextType()
	@FindBy(xpath = "//input[@id='city']")
	public WebElement Deepdomlevel3Cityfield;
	@TextType()
	@FindBy(xpath = "//input[@id='state']")
	public WebElement DeepdomStateProvincefield;
	@TextType()
	@FindBy(xpath = "//input[@id='zip']")
	public WebElement Deepdomlevel3ZipPostalCode;
	@TextType()
	@FindBy(xpath = "//input[@id='country']")
	public WebElement Deepdomlevel3CountryTextfield;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Light']")
	public WebElement DeepdomradiobuttonforDark;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Dark']")
	public WebElement DeepdomthemeRadioButtonforDark;
	@ButtonType()
	@FindBy(xpath = "//div/button[normalize-space(.)='Submit']")
	public WebElement DeepdomSubmitButton;	
	
	
	@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Phone:']/ancestor::form[1]/input[@type='text'][3]")
		public WebElement NestedInsideFrameDisabledField;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Disabled Button']")
		public WebElement disabledButton;
	
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
	@ButtonType()
	@FindBy(xpath = "//input[@id='street']")
	public WebElement street;
	@BooleanType()
	@FindBy(xpath = "//input[@name='notify_email']")
	public WebElement Preferences;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Dark']/input[@name='theme']")
	public WebElement Theme_Settings;
	@ButtonType()
	@FindBy(xpath = "//tr[1]//button[normalize-space(.)='View']")
	public WebElement SimpleHTMLTableViewButton;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-item-root[@data-target-selection-name='sfdc:TabDefinition.LWC_Project']/a")
	public WebElement lWCProject;
		
}
