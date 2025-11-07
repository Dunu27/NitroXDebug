package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.base.java.WebComponent;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="lwcFlexiComponent"                                
               , summary=""
               , connection="LWC_Org"
               , lightningWebComponent="weatherScreen"
               , namespacePrefix=""
     )             
public class lwcFlexiComponent {

	@FindBy(xpath = ".//lightning-input[@type='text']")
	@WebComponentMapping(componentId = "5cd71547-c934-470c-9115-a10fe7f0307f")
	public WebComponent Enter_City_Name;
	@FindBy(xpath = ".//lightning-button[@label='Get Weather Details']")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent Get_Weather_Details_button;
	@TextType()
	@FindBy(xpath = "//lightning-layout-item[1]//span")
	public WebElement WeatherCity;
	
}
