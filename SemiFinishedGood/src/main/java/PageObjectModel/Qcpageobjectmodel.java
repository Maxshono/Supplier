package PageObjectModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Qcpageobjectmodel {

	@FindBy(linkText ="QC")
	WebElement Link_QC;
	
	@FindBy(id="Is100Sampling")
	WebElement Checkbox_Is100Sampling;
	
	@FindBy(id="QtyPerSample")
	WebElement Textbox_QtyPerSample;
	
	@FindBy(id="SamplingDays")
	WebElement Textbox_SamplingDays;
	
	@FindBy(id="ApprovedDays")
	WebElement Textbox_ApprovedDays;
	
	@FindBy(id="ReTestDays")
	WebElement Textbox_ReTestDays;
	
	@FindBy(name="RoundingOff")
	WebElement Textbox_RoundingOff;
	
	@FindBy(name="SnopOverages")
	WebElement Textbox_SnopOverages;
	
}
