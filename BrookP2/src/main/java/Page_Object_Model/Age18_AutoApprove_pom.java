package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_Class;

public class Age18_AutoApprove_pom extends Base_Class {
	
	public Age18_AutoApprove_pom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"High contrast\"]")
	private WebElement selectTheme;
	@FindBy(xpath = "//select[@class=\"form-select select-style\"]")
	private WebElement clkdd2;
	//@FindBy(xpath="(//select[@class=\"form-select select-style\"]/option)[9]")
	//private WebElement selectAge;
	
	public WebElement getHighcontrast() {
		return selectTheme;
	}
	public WebElement getclkdd() {
		return clkdd2;
	}
	/*
	 * public WebElement getAge18() { return selectAge; }
	 */

}
