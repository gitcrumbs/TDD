package B_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ALoginPage {
	
	
	
	
	ALoginPage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	

}