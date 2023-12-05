package Page_Object_Model;

import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_Class;

public class Manager_User_pom extends Base_Class{
	
	public Manager_User_pom() {
		PageFactory.initElements(driver, this);
	}
	
	

}
