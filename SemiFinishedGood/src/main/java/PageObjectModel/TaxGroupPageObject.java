package PageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaxGroupPageObject {

	@FindBy(linkText ="Tax Group")
	WebElement  Link_TaxGroup;
	
	@FindBy(xpath = "//*[@id=\"TaxGroup\"]/button")
	WebElement Button_AddTaxGroup;
	
	@FindBy(xpath="//*[@id=\"dvProduct\"]/div[1]/div/div/div/div/div/button")
	WebElement Dropdown_Location;
	
	@FindBy(id="TaxGroupIDLocal")
	WebElement Dropdown_SalesTaxGroupIDLocal;
	
	@FindBy(id="TaxGroupIDInterState")
	WebElement Dropdown_SalesTaxGroupIDInterState;
	
	@FindBy(id="PurchaseTaxGroupIDLocal")
	WebElement Dropdown_PurchaseTaxGroupIDLocal;
	
	@FindBy(id="PurchaseTaxGroupIDInterState")
	WebElement Dropdown_PurchaseTaxGroupIDInterState;
	
	@FindBy(id="RcmTaxGroupIDLocal")
	WebElement Dropdown_RcmTaxGroupIDLocal;
	
	@FindBy(id="RcmTaxGroupIDInterState")
	WebElement Dropdown_RcmTaxGroupIDInterState;
	
	@FindBy(id="RcmPurchaseTaxGroupIDLocal")
	WebElement Dropdown_RcmPurchaseTaxGroupIDLocal;
	
	@FindBy(id="RcmPurchaseTaxGroupIDInterState")
	WebElement Dropdown_RcmPurchaseTaxGroupIDInterState;
	
	@FindBy(id="btnAddProductTaxGroup1")
	WebElement ProductAddButton_btnAddProductTaxGroup1;
	
	
	
	
}
