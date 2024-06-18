package PageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageObjectModel {




	@FindBy(xpath="//*[@id=\"page-toolbar\"]/a[1]")
	WebElement Link_CreateButton;

	@FindBy(id="ProductTypeID")
	WebElement Dropdown_ProductType;

	@FindBy(name="ProductCode")
	WebElement Textbox_ProductCode;

	@FindBy(name="ProductName")
	WebElement Textbox_ProductName;

	@FindBy(id="ProductShortName")
	WebElement Textbox_ShortName;

	@FindBy(id="GenericName")
	WebElement Textbox_GenericName;

	@FindBy(id="HSNCode")
	WebElement Textbox_HSNCode;

	@FindBy(id="PCode")
	WebElement Textbox_PCode;

	@FindBy(id="ShelfLifeInMonths")
	WebElement Textbox_ShelfLifeInMonths;

	@FindBy(id="StandardPrice")
	WebElement Textbox_StandardPrice;

	@FindBy(name="PharmaGroupRequired")
	WebElement Checkbox_PharmaGroupRequired;

	@FindBy(id="IsRcm")
	WebElement Checkbox_IsRcm;

	@FindBy(id="Specification")
	WebElement Textbox_Specification;

	@FindBy(id="IsPurchase")
	WebElement Radiobutton_IsPurchase;

	@FindBy(id="PurchaseTolerance")
	WebElement  Textbox_PurchaseTolerance;

	@FindBy(id="MiniPurchaseLotSize")
	WebElement Textbox_MiniPurchaseLotSize;

	@FindBy(name="Overages")
	WebElement Textbox_Overages;


	@FindBy(name="PoUomID")
	WebElement Dropdown_PoUom;

	@FindBy(name="StUomID")
	WebElement Dropdown_StUomID;

	@FindBy(id="SecondaryUomID")
	WebElement Dropdown_SecondaryUom;

	@FindBy(id="IsSale")
	WebElement Radiobutton_IsSale;
	
	@FindBy(id="IsExport")
	WebElement RadioButton_IsExport;
	
	@FindBy(id="IsQCRequired")
	WebElement Radiobutton_IsQCRequired;






}
