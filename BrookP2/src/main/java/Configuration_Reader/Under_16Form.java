package Configuration_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Under_16Form {
	public static Properties prop;
	
	public Under_16Form() throws IOException {
		File f = new File(
				"src\\main\\java\\Configuration_Properties\\Configuration.Properties");
		FileInputStream fi = new FileInputStream(f);

		prop = new Properties();
		prop.load(fi);

	}

	public String getURL() {

		String URL = prop.getProperty("URL");
		return URL;

	}
	
	public String getpostCode() {
		String postcode= prop.getProperty("Postcode");
		return postcode;
	}

	public String getFirstName() {
		String FN = prop.getProperty("FirstName");
		return FN;
	}
	public String getLastName() {
	String LN=	prop.getProperty("LastName");
		return LN;
	}
	
	public String getmobileno() {
		String MN = prop.getProperty("MobileNO");
		return MN;
	}
	public String getemail() {
		String email = prop.getProperty("Email");
		return email;
	}
	public String StaffURL() {
		String staffurl = prop.getProperty("StaffHubURL");
		return staffurl;
	}
	
	public String getsEmail() {
		String sEmail =prop.getProperty("sEmail");
		return sEmail;
	}
	public String getsPassword() {
		String sPass=prop.getProperty("spassword");
		return sPass;
	}
	
	public String getContactHr() {
		String hr =prop.getProperty("Hr");
		return hr;
	}
	public String getcontactMin() {
		String min = prop.getProperty("Min");
		return min;
	}
	public String getaddress1() {
		String address1= prop.getProperty("Address1");
		return address1;
		
	}
	public String getAddress2() {
		String address2=prop.getProperty("Address2");
		return address2;
	}
	public String gettown() {
		String town= prop.getProperty("Town");
		return  town;
	}
	public String getNote() {
		String note=prop.getProperty("Note");
		return note;
	}
}
