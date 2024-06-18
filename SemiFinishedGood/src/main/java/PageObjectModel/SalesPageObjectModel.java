package PageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPageObjectModel {

	
	@FindBy(linkText ="Sales")
	WebElement Link_Sales;
	
	@FindBy(id="IsBatchwise")
	WebElement Checkbox_IsBatchwise;
	
	@FindBy(id="NearExpiryMonths")
	WebElement Textbox_NearExpiryMonths;
	
	@FindBy(name="StockistMargin")
	WebElement Textbox_StockistMargin;
	
	@FindBy(id="PacksPerCarton")
	WebElement Textbox_PacksPerCarton;
	
	@FindBy(id="CartonPerShipper")
	WebElement Textbox_CartonPerShipper;
	
	@FindBy(id="VolumePerCarton")
	WebElement Textbox_VolumePerCarton;
	
	@FindBy(id="WeightPerCarton")
	WebElement Textbox_WeightPerCarton;
	
	
}
