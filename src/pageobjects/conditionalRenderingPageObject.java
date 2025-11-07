package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="conditionalRenderingPageObject"                                
               , summary=""
               , connection="LWC_Org"
               , lightningWebComponent="conditionalRendering"
               , namespacePrefix=""
     )             
public class conditionalRenderingPageObject {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'slds-p-around_x-small')][text()='I am Visible']")
	public WebElement ConditionalRenderingText;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Click Me']/ancestor::div[2]")
	public WebElement Text;
	
}
