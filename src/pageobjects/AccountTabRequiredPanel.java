package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="AccountTabRequiredPanel"                                
               , summary=""
               , connection="LWC_Org"
               , lightningWebComponent="accountPanel2b"
               , namespacePrefix=""
     )             
public class AccountTabRequiredPanel {

	@FindBy(xpath = ".//lightning-accordion-section[@label='Required Input Fields']")
	@WebComponentMapping(componentId = "c3c92385-e8d7-4126-8d63-8b967b44ae4d")
	public WebComponent Required_Input_Fields_accordion_section;
	@FindBy(xpath = ".//lightning-input[@name='Name' and @label='Account Name' and @type='text']")
	@WebComponentMapping(componentId = "5cd71547-c934-470c-9115-a10fe7f0307f")
	public WebComponent Account_NameRequired;
	@FindBy(xpath = ".//lightning-input[@name='OwnerId']")
	@WebComponentMapping(componentId = "5cd71547-c934-470c-9115-a10fe7f0307f")
	public WebComponent Account_OwnerRequired;
	@FindBy(xpath = ".//lightning-button[@label='Submit']")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent Submit_button;
	@FindBy(xpath = ".//lightning-button[@label='Reset']")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent Reset_button;
	
}
