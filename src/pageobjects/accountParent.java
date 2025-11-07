package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.base.java.WebComponent;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="accountParent"                                
               , summary=""
               , connection="LWC_Org"
               , lightningWebComponent="accountParent"
               , namespacePrefix=""
     )             
public class accountParent {

	@FindBy(xpath = ".//lightning-input[@type='text']")
	@WebComponentMapping(componentId = "5cd71547-c934-470c-9115-a10fe7f0307f")
	public WebComponent Enter_account_name;
	@FindBy(xpath = ".//lightning-button[@label='Search']")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent Search_button;
	@FindBy(xpath = ".//td[contains(@class,'fix-safari_perf')]/following-sibling::td[contains(@class,'fix-safari_perf')]//lightning-button")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent View_Contacts_button;
	
}
