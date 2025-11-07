package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.base.java.WebComponent;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="boards"                                
               , summary=""
               , connection="Dhruv"
               , lightningWebComponent="boards"
               , namespacePrefix=""
     )             
public class boards {

	@FindBy(xpath = ".//td[contains(@class,'fix-safari_perf')]/following-sibling::td[contains(@class,'fix-safari_perf')]//lightning-button[@label='Open Board']")
	@WebComponentMapping(componentId = "5c6b2d69-4033-48fd-9f45-8a0f567a8251")
	public WebComponent Open_Board_button;
	
}
