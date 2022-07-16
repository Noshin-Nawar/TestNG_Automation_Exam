package toggleValidation;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	public class ValidationAndCheckOperation {

	WebDriver driver;

	public  ValidationAndCheckOperation (WebDriver driver) {
		this.driver= driver;	
		
	}
	@FindBy(how=How.NAME,using="todo") WebElement ALLELEMENT;
	@FindBy(how=How.XPATH,using="//input[@name='allbox']") WebElement TOGGLE_ALL;
	@FindBy(how=How.NAME,using="todo[10]") WebElement CLICK_ITEM_SEVEN;
	@FindBy(how=How.XPATH,using="//input[@value='Remove']") WebElement ITEM_REMOVE;
	@FindBy(how=How.XPATH,using="//input[@name='categorydata']") WebElement TEXT_BOX_ADD;
	@FindBy(how=How.XPATH,using="//input[@value='Add category']") WebElement ADD_CATEGORY;
	@FindBy(how=How.XPATH,using="//button[@type='button'][1]") WebElement SET_SKYBLUE;
	@FindBy(how=How.NAME,using="due_month") WebElement MONTHS_ELEMENT;
	@FindBy(how=How.NAME,using="category") WebElement CATEGORY;

	////junit  1. Test case. Validating if the  toogle all is selected.

	public void toggleAll() {
	TOGGLE_ALL.click();
	}
	public boolean checkIfAllElementsAreChecked()
	{
	return TOGGLE_ALL.isSelected();
	}

	//junit number 2.Validate that a single list item could be removed
	//using the remove button when a single checkbox is selected.

	public void checkItemNumberToRemove() {
	CLICK_ITEM_SEVEN.click();
	}
	public boolean checkifOneitemIsSelected() {
	return CLICK_ITEM_SEVEN.isSelected();
	}

	public void removeButton() {
	ITEM_REMOVE.click();	
	}
	public boolean confirmRemoved() {
	return ITEM_REMOVE.isSelected();
	}

	//junit3 Validate that all list item could be removed 
	//using the remove button and when "Toggle All" functionality is on.

	public void removeAllbutton() throws InterruptedException
	{
	TOGGLE_ALL.click();
	Thread.sleep(2000);
	ITEM_REMOVE.click();	
	}

	public boolean ifAllisChecked()
	{
	return TOGGLE_ALL.isSelected();
	}

	public boolean ifAllItemIsRemoved()
	{
	return ITEM_REMOVE.isSelected();
	}
}
