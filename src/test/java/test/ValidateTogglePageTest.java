package test;



	import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import toggleValidation.ValidationAndCheckOperation;
import util.BrowserFactory;

	public class ValidateTogglePageTest {

	WebDriver driver;

	//@Test
	public void validatepage() throws InterruptedException 
	{
	driver= BrowserFactory.init();
	Thread.sleep(2000);

	ValidationAndCheckOperation validationAndCheckOperation=PageFactory.initElements(driver,ValidationAndCheckOperation.class );
	validationAndCheckOperation.toggleAll();
	if(validationAndCheckOperation.checkIfAllElementsAreChecked() == true)
	{
	System.out.print("All items are checked");
	}
	}

	//Validate that a single list item could be removed
	//using the remove button when a single checkbox is selected.

	@Test
	  public void validateButtonIsChecked() throws InterruptedException 
	  {
		ValidationAndCheckOperation validationAndCheckOperation=PageFactory.initElements(driver,ValidationAndCheckOperation.class );
		validationAndCheckOperation.checkItemNumberToRemove();
		if(validationAndCheckOperation.checkifOneitemIsSelected() == true)
			{	
			System.out.println("The item is selected");
			Thread.sleep(2000);
				validationAndCheckOperation.removeAllbutton();
		if (validationAndCheckOperation.confirmRemoved () == true)
		Thread.sleep(2000);
		System.out.println("The selected item is deleted");
			}
	   	}
			}
	      
	//junit3: Validate that all list item could be removed 
	//using the remove button and when "Toggle All" functionality is on.
//		@Test
	//   public void checkButton() throws InterruptedException
	//   {
//		  ValidationAndCheckOperation validationAndCheckOperation=PageFactory.initElements(driver,ValidationAndCheckOperation.class );
//	   		if(validationAndCheckOperation.ifAllisChecked()== true)
//			{
//				System.out.println("Items Are all Checked");
//				Thread.sleep(2000);
//				
//				validationAndCheckOperation.removeButton();
//				if (validationAndCheckOperation.ifAllItemIsRemoved()==true)
//					
//				Thread.sleep(2000);
//				System.out.println("All item are deleted");
//			}	
//		//		
	//}	
//			
	//}	


	////testng 1
	//validationAndCheckOperation.textIncategory();
	//validationAndCheckOperation.addItem();
	//
	//validationAndCheckOperation.ifItexist();
	//Assert.assertEquals("The category you want to add already exists","Cricket Added By ashok");
	//
	//

	//validationAndCheckOperation.setBackGroundcolor();
		//validationAndCheckOperation.setBackGroundcolor();
		
		//validationAndCheckOperation.selecting_month();
		